package com.example.design_system.components.button

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import com.example.design_system.theme.PokedexTheme


@Stable
sealed interface ButtonStyle {
    val primaryTextColor @Composable get() = PokedexTheme.primaryButtonTextColor
    val watterButton  @Composable get() = PokedexTheme.watterButton
    val allTypesButton @Composable get() = PokedexTheme.allTypesButton
    val dragonButton @Composable get() = PokedexTheme.dragonButton
    val eletricButton @Composable get() = PokedexTheme.eletricButton
    val fairyButton @Composable get() = PokedexTheme.fairyButton
    val ghostButton @Composable get() = PokedexTheme.ghostButton
    val fireButton @Composable get() = PokedexTheme.fireButton
    val iceButton @Composable get() = PokedexTheme.iceButton
    val grassButton @Composable get() = PokedexTheme.grassButton
    val bugButton @Composable get() = PokedexTheme.bugButton
    val fightingButton @Composable get() = PokedexTheme.fightingButton
    val normalButton @Composable get() = PokedexTheme.normalButton
    val darkButton @Composable get() = PokedexTheme.darkButton
    val primaryButton @Composable get() = PokedexTheme.primaryButton
    val secondaryButton @Composable get() = PokedexTheme.secondaryButton

}