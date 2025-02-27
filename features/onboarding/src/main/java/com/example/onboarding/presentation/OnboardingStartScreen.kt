package com.example.onboarding.presentation


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.example.design_system.theme.PokedexTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource
import com.example.design_system.R.*
import com.example.design_system.R.drawable.*
import com.example.onboarding.R

@Composable
fun OnboardingStartScreen() {
    Row(modifier = Modifier
        .fillMaxSize()
        .background(PokedexTheme.primaryButton),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically

   ) {
        Image(  painter = painterResource(id = ic_pokedex_name),
            contentDescription = null)
    }
}

@Preview(showBackground = true)
@Composable
fun OnboardingStartScreenPreview() {
    OnboardingStartScreen()
}