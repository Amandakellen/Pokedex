package com.example.onboarding.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.features.onboarding.presentation.OnboardingHomeScreen
import com.example.onboarding.presentation.view.OnboardingScreen
import com.example.onboarding.presentation.view.informative.OnboardingInformativeScreen

fun NavGraphBuilder.OnboardingNavigation(navController: NavController) {
    navigation(startDestination = "onboardingHome", route = "onboarding") {
        composable("onboardingHome") {
            OnboardingHomeScreen(navController = navController)
        }
        composable("onboardingInformative") {
            OnboardingInformativeScreen(navController = navController)
        }
        composable("onboardingLogin") {
            OnboardingScreen(navController = navController)
        }
    }

}