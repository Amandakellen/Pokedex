package com.example.onboarding.presentation.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.design_system.components.button.ButtonComponent
import com.example.design_system.components.button.ButtonStyle
import com.example.design_system.theme.AppTypography
import com.example.design_system.theme.PokedexTheme
import com.example.features.onboarding.R
import com.example.onboarding.presentation.action.OnboardingAction.Action.*
import com.example.onboarding.presentation.effect.OnboardingEffect
import com.example.onboarding.presentation.viewModel.OnboardingViewModel
import org.koin.androidx.compose.koinViewModel

private const val MIN_WIDTH = 0.7f
private const val MAX_WIDTH = 0.90f
private const val MIN_HEIGHT = 0.1f

@Composable
fun OnboardingScreen(
    viewModel: OnboardingViewModel = koinViewModel(),
    navController: NavController
) {
    val effect = viewModel.effect.collectAsState()
    val sendAction = viewModel::sendAction

    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp
    val buttonHeight = screenHeight * MIN_HEIGHT

    val modifier = Modifier
        .height(buttonHeight)
        .wrapContentWidth()
        .widthIn(
            min = LocalConfiguration.current.screenWidthDp.dp * MIN_WIDTH,
            max = LocalConfiguration.current.screenWidthDp.dp * MAX_WIDTH
        )
        .padding(
            vertical = PokedexTheme.padding.medium,
            horizontal = PokedexTheme.padding.superSmall
        )

    LaunchedEffect(effect.value) {
        effect.value?.let { checkEffect(it, navController) }
    }

    Scaffold(
        content = {
            Column(
                modifier = Modifier
                    .padding(it)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                OnboardingContent(modifier
                    .weight(2f)
                    .padding(PokedexTheme.padding.medium))
                ButtonComponent(
                    modifier = modifier,
                    label =
                        stringResource(R.string.onboarding_screen_login_button),
                    style = ButtonStyle.Primary,
                    onClick = {
                        sendAction(ClickLoginButton)
                    }
                )

                ButtonComponent(
                    modifier = modifier,
                    label =
                        stringResource(R.string.onboarding_screen_create_account_button),
                    style = ButtonStyle.Secondary,
                    onClick = {
                        sendAction(ClickCreateAccountButton)
                    }
                )
            }
        }
    )
}

@Composable
fun OnboardingContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Image(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .weight(3f)
                .fillMaxWidth(),
            painter = painterResource(id = R.drawable.boy_and_girl),
            contentDescription = null
        )

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(PokedexTheme.padding.small),
            text = stringResource(R.string.onboarding_screen_title),
            style = AppTypography.headlineMedium,
            textAlign = TextAlign.Center,
            color = PokedexTheme.text
        )

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(PokedexTheme.padding.small),
            text = stringResource(R.string.onboarding_screen_subtitle),
            style = AppTypography.bodyLarge,
            textAlign = TextAlign.Center,
            color = PokedexTheme.text
        )
        Spacer(modifier = Modifier.weight(1f))
    }
}

fun checkEffect(effect: OnboardingEffect, navController: NavController) {
    if(effect is OnboardingEffect.GoToLogin) {
        //navController.navigate("create_account_home")
    }else
        if (effect is OnboardingEffect.GoToCreateAccount) {
        navController.navigate("createAccountHome")
    }
}


@Preview(showBackground = true)
@Composable
fun OnboardingScreenPreview() {
    val navController = rememberNavController()
    val fakeViewModel = OnboardingViewModel()
    OnboardingScreen(viewModel = fakeViewModel, navController = navController)
}
