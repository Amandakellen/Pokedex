package com.example.poekedex.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.create_account.navigation.CreateAccountNavigation
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