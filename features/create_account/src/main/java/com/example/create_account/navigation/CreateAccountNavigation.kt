package com.example.create_account.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.create_account.presentation.view.CreateAccountHome

fun NavGraphBuilder.CreateAccountNavigation(navController: NavController)  {
    navigation(startDestination = "createAccountHome", route = "createAccount") {
        composable("createAccountHome") {
            CreateAccountHome(navController = navController)
        }
    }
}