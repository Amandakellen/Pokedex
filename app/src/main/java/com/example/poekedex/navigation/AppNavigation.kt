package com.example.poekedex.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.features.onboarding.presentation.OnboardingStartScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "onboarding") {
        composable("onboarding") {
            OnboardingStartScreen()
        }
    }
}