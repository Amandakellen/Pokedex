package com.example.onboarding.presentation.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.design_system.components.button.ButtonComponent
import com.example.design_system.components.button.ButtonStyle
import com.example.design_system.theme.AppTypography
import com.example.design_system.theme.PokedexTheme
import com.example.features.onboarding.R
import com.example.onboarding.presentation.viewModel.OnboardingViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun OnboardingScreen(
    modifier: Modifier = Modifier,
    viewModel: OnboardingViewModel = koinViewModel(),
    navController: NavController
) {
    val state by viewModel.state.collectAsState()
    val sendAction = viewModel::sendAction

    Scaffold(
        content = {
            Column(
                modifier = Modifier
                    .padding(it),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                OnboardingContent(modifier.weight(2f))
                ButtonComponent(
                    label =
                        stringResource(R.string.informative_fisrt_screen_continue_button),
                    style = ButtonStyle.Primary,
                    onClick = {

                    }
                )

                ButtonComponent(
                    label =
                    stringResource(R.string.onboarding_screen_create_account_button),
                    style = ButtonStyle.Secondary,
                    onClick = {

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


@Preview(showBackground = true)
@Composable
fun OnboardingScreenPreview() {
    val navController  = rememberNavController()
    val fakeViewModel = OnboardingViewModel()
    OnboardingScreen(viewModel = fakeViewModel, navController =  navController)
}
