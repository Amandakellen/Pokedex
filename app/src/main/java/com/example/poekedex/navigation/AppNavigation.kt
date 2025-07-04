package com.example.poekedex.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.create_account.navigation.CreateAccountNavigation
import com.example.features.onboarding.presentation.OnboardingHomeScreen
import com.example.onboarding.navigation.OnboardingNavigation

@Composable
fun AppNavigation(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = "onboarding"
    ) {
        OnboardingNavigation(navController = navController)
        CreateAccountNavigation(navController = navController)

    }
}