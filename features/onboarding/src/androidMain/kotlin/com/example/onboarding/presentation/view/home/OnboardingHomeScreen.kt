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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.design_system.R.drawable.*
import com.example.features.onboarding.presentation.state.OnboardingState
import com.example.onboarding.presentation.action.OnboardingAction.*
import com.example.onboarding.presentation.viewModel.OnboardingViewModel
import kotlinx.coroutines.delay
import org.koin.androidx.compose.koinViewModel
import androidx.compose.runtime.LaunchedEffect
import com.example.onboarding.presentation.action.OnboardingAction.Action.*
import com.example.onboarding.presentation.effect.OnboardingEffect
import com.example.onboarding.presentation.effect.OnboardingEffect.*

@Composable
fun OnboardingHomeScreen(
    modifier: Modifier = Modifier,
    viewModel: OnboardingViewModel = koinViewModel(),
    navController: NavController
) {
    LaunchedEffect(Unit) {
        viewModel.sendAction(Initialize)
    }

    val effect by viewModel.effect.collectAsState()

    LaunchedEffect(effect) {
        when (effect) {
            is GoToOnboarding -> {
                navController.navigate("onboardingInformative")
            }
            else -> {}
        }
    }
    LaunchedEffect(Unit) {
        delay(4000L)
        viewModel.sendAction(GoToInformativeScreen)
    }

    Row(
        modifier = modifier
            .fillMaxSize()
            .background(PokedexTheme.primaryButton),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        AnimeImage(ic_pokedex_name)
    }
}


@Composable
fun AnimeImage(imageResId: Int) {
    var scale by remember { mutableStateOf(1f) }
    var shouldAnimate by remember { mutableStateOf(true) }

    val scaleAnimation = if (shouldAnimate) {
        val scaleAnim = rememberInfiniteTransition()
        scaleAnim.animateFloat(
            initialValue = 1f,
            targetValue = 1.2f,
            animationSpec = infiniteRepeatable(
                animation = tween(durationMillis = 1000, easing = LinearEasing),
                repeatMode = RepeatMode.Reverse
            )
        ).value
    } else {
        1f
    }

    LaunchedEffect(Unit) {
        delay(4000L)
        shouldAnimate = false
    }

    LaunchedEffect(shouldAnimate) {
        if (!shouldAnimate) {
            scale = 1f
        }
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
                .scale(scaleAnimation)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OnboardingHomeScreenPreview() {
    val navController = rememberNavController()
    val fakeViewModel = OnboardingViewModel()
    OnboardingHomeScreen(viewModel = fakeViewModel, navController = navController)
}