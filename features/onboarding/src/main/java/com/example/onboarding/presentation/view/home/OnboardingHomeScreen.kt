package com.example.features.onboarding.presentation


import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.example.design_system.theme.PokedexTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.design_system.R.drawable.*
import com.example.features.onboarding.presentation.state.OnboardingState
import com.example.onboarding.presentation.action.OnboardingAction.*
import com.example.onboarding.presentation.action.OnboardingAction.Action.GoToInformativeScreen
import com.example.onboarding.presentation.viewModel.OnboardingViewModel
import kotlinx.coroutines.delay
import org.koin.androidx.compose.getViewModel
import org.koin.androidx.compose.koinViewModel
import androidx.compose.runtime.LaunchedEffect as LaunchedEffect1

@Composable
fun OnboardingHomeScreen(
    modifier: Modifier = Modifier
) {
    val viewModel: OnboardingViewModel = koinViewModel()
    val state by viewModel.state.collectAsState()
    if(state is OnboardingState.Loading) {
        Row(
            modifier = modifier
                .fillMaxSize()
                .background(PokedexTheme.primaryButton),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ) {
            AnimeImage(ic_pokedex_name,viewModel::sendAction )
        }
    }

}

@Composable
fun AnimeImage(imageResId: Int, sendAction: (Action) -> Unit) {
    var scale by remember { mutableStateOf(1f) }
    val scaleAnim = rememberInfiniteTransition()
    val scaleAnimation by scaleAnim.animateFloat(
        initialValue = 1f,
        targetValue = 1.2f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 1000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        )
    )

    LaunchedEffect1(key1 = true) {
        delay(4000L)
        sendAction(GoToInformativeScreen)
    }

    LaunchedEffect1(key1 = scaleAnimation) {
        scale = scaleAnimation
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
                .scale(scale)
        )
    }

}


@Preview(showBackground = true)
@Composable
fun OnboardingHomeScreenPreview() {
    OnboardingHomeScreen()
}