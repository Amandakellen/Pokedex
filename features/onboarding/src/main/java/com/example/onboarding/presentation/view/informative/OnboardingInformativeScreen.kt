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
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.text.style.TextAlign
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
import org.koin.androidx.compose.koinViewModel

const val PAGER_SIZE = 2
const val FIRST_STEP = 0
const val SECOND_STEP = 1

@Composable
fun OnboardingInformativeScreen(
    viewModel: OnboardingViewModel = koinViewModel(),
    navController: NavController
){
    val state by viewModel.state.collectAsState()
    val sendAction = viewModel::sendAction
    val images = listOf(R.drawable.ic_professor_and_trainer, R.drawable.girl)

    val pagerState = rememberPagerState(state.uiModel.currentStep) { images.size }



    LaunchedEffect(pagerState) {
        snapshotFlow { pagerState.currentPage }.collect { currentPage ->
            sendAction(OnboardingAction.Action.NavigateStep(step = currentPage))
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
                    modifier = Modifier.weight(.1f),
                    state = pagerState
                ) { page ->
                    OnboardingInformativeStepScreen(images[page])
                }


                ContentControl(
                    pagerState = pagerState,
                    pageCount = images.size,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(PokedexTheme.padding.medium)
                )

                ButtonComponent(
                    label = stringResource(R.string.informative_fisrt_screen_continue_button),
                    style = ButtonStyle.Primary,
                    onClick = {
                        sendAction(
                            OnboardingAction.Action.NavigateStep(
                                pagerState.currentPage.plus(
                                    1
                                )
                            )
                        )
                    }
                )
            }
        }
    )

}

@Composable
fun OnboardingInformativeStepScreen(@DrawableRes imageRes: Int) {
    Column {
        Spacer(modifier = Modifier.height(PokedexTheme.padding.superSmall))
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            painter = painterResource(id = imageRes),
            contentDescription = null
        )

        Spacer(modifier = Modifier.height(PokedexTheme.padding.medium))

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(PokedexTheme.padding.medium),
            text = stringResource(R.string.informative_fisrt_screen_title),
            style = AppTypography.headlineMedium,
            textAlign = TextAlign.Center
        )

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(PokedexTheme.padding.medium),
            text = stringResource(R.string.informative_fisrt_screen_subtitle),
            style = AppTypography.bodyLarge,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview(showBackground = true)
@Composable
fun OnboardingInformativeScreenPreview() {
    val navController  = rememberNavController()
    val fakeViewModel = OnboardingViewModel()
    OnboardingInformativeScreen(fakeViewModel, navController)
}
