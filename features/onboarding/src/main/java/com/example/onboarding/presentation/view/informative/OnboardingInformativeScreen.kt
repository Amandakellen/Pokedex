package com.example.onboarding.presentation.view.informative

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.design_system.components.button.ButtonComponent
import com.example.design_system.components.button.ButtonStyle
import com.example.design_system.components.contentcontrol.ContentControl
import com.example.design_system.theme.AppTypography
import com.example.design_system.theme.PokedexTheme
import com.example.features.onboarding.R
import com.example.onboarding.presentation.action.OnboardingAction
import com.example.onboarding.presentation.effect.OnboardingEffect
import com.example.onboarding.presentation.viewModel.OnboardingViewModel
import kotlinx.coroutines.launch
import org.koin.androidx.compose.koinViewModel

const val PAGER_SIZE = 2
const val FIRST_STEP = 0
private const val MIN_WIDTH = 0.7f
private const val MAX_WIDTH = 0.90f
private const val MIN_HEIGHT = 0.1f

@Composable
fun OnboardingInformativeScreen(
    viewModel: OnboardingViewModel = koinViewModel(),
    navController: NavController
) {
    val state by viewModel.state.collectAsState()
    val effect = viewModel.effect.collectAsState()
    val sendAction = viewModel::sendAction

    val images = listOf(R.drawable.ic_professor_and_trainer, R.drawable.girl)
    val pagerState =
        rememberPagerState(initialPage = state.uiModel.currentStep, pageCount = { images.size })
    val coroutineScope = rememberCoroutineScope()

    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp
    val buttonHeight = screenHeight * MIN_HEIGHT

    LaunchedEffect(effect.value) {
        if (effect.value is OnboardingEffect.GoToLoginScreen){
            navController.navigate("onboardingLogin")
        }
    }

    LaunchedEffect(state) {
        val currentStep = state.uiModel.currentStep
        if (pagerState.currentPage != currentStep) {
            pagerState.animateScrollToPage(currentStep)
        }
    }

    Scaffold(
        content = {
            Column(
                modifier = Modifier
                    .padding(it),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                HorizontalPager(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterHorizontally),
                    state = pagerState,
                    userScrollEnabled = true
                ) { page ->
                    OnboardingInformativeStepScreen(images[page], page)
                }

                ContentControl(
                    pagerState = pagerState,
                    pageCount = pagerState.pageCount,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(PokedexTheme.padding.medium)
                )

                ButtonComponent(
                    modifier = Modifier
                        .height(buttonHeight)
                        .wrapContentWidth()
                        .widthIn(
                            min = LocalConfiguration.current.screenWidthDp.dp * MIN_WIDTH,
                            max = LocalConfiguration.current.screenWidthDp.dp * MAX_WIDTH
                        )
                        .padding(
                            vertical = PokedexTheme.padding.medium,
                            horizontal = PokedexTheme.padding.superSmall
                        ),
                    label = if (pagerState.currentPage == FIRST_STEP) {
                        stringResource(R.string.informative_fisrt_screen_continue_button)
                    } else {
                        stringResource(R.string.informative_second_screen_continue_button)
                    },
                    style = ButtonStyle.Primary,
                    onClick = {
                        val next = pagerState.currentPage + 1
                        sendAction(OnboardingAction.Action.NavigateStep(next))
                        if (next < images.size) {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(next)
                            }
                        }
                    }
                )
            }
        }
    )
}

@Composable
fun OnboardingInformativeStepScreen(@DrawableRes imageRes: Int, page: Int) {
    Column {
        Spacer(modifier = Modifier.height(PokedexTheme.padding.superLarge))
        Image(
            modifier = Modifier
                .weight(3f)
                .fillMaxWidth(),
            painter = painterResource(id = imageRes),
            contentDescription = null
        )

        Spacer(modifier = Modifier.height(PokedexTheme.padding.medium))

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(PokedexTheme.padding.small),
            text = if (page == 0) {
                stringResource(R.string.informative_fisrt_screen_title)
            } else stringResource(R.string.informative_second_screen_title),
            style = AppTypography.headlineMedium,
            textAlign = TextAlign.Center,
            color = PokedexTheme.text
        )

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(PokedexTheme.padding.small),
            text = if (page == 0) {
                stringResource(R.string.informative_fisrt_screen_subtitle)
            } else stringResource(R.string.informative_second_screen_subtitle),
            style = AppTypography.bodyLarge,
            textAlign = TextAlign.Center,
            color = PokedexTheme.text
        )
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview(showBackground = true)
@Composable
fun OnboardingInformativeScreenPreview() {
    val navController = rememberNavController()
    val fakeViewModel = OnboardingViewModel()
    OnboardingInformativeScreen(fakeViewModel, navController)
}
