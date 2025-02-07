package com.example.design_system.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

// usar IconFont de exemplo

@Immutable
data class PokedexColorScheme(
    val watterButton: Color,
    val allTypesButton: Color,
    val dragonButton: Color,
    val eletricButton: Color,
    val fairyButton: Color,
    val ghostButton: Color,
    val fireButton: Color,
    val iceButton: Color,
    val grassButton: Color,
    val bugButton: Color,
    val fightingButton: Color,
    val normalButton: Color,
    val darkButton: Color,
    val customColor1: Color,
    val background: Color,
    val text: Color,
)

val extendedLight = PokedexColorScheme(
    watterButton = watterButtonLight,
    allTypesButton = allTypesButtonLight,
    dragonButton = dragonButtonLight,
    eletricButton = eletricButtonLight,
    fairyButton = fairyButtonLight,
    ghostButton = ghostButtonLight,
    fireButton = fireButtonLight,
    iceButton = iceButtonLight,
    grassButton = grassButtonLight,
    bugButton = bugButtonLight,
    fightingButton = fightingButtonLight,
    normalButton = normalButtonLight,
    darkButton = darkButtonLight,
    customColor1 = customColor1Light,
    background = onPrimaryLightHighContrast,
    text = surfaceContainerDark
)

val extendedDark = PokedexColorScheme(
    watterButton = watterButtonDark,
    allTypesButton = allTypesButtonDark,
    dragonButton = dragonButtonDark,
    eletricButton = eletricButtonDark,
    fairyButton = fairyButtonDark,
    ghostButton = ghostButtonDark,
    fireButton = fireButtonDark,
    iceButton = iceButtonDark,
    grassButton = grassButtonDark,
    bugButton = bugButtonDark,
    fightingButton = fightingButtonDark,
    normalButton = normalButtonDark,
    darkButton = darkButtonDark,
    customColor1 = customColor1Dark,
    background = onPrimaryDarkHighContrast,
    text = surfaceContainerLight
)

val LocalPokedexColorScheme = staticCompositionLocalOf<PokedexColorScheme> {
    error("No PokedexColorScheme provided")
}

object PokedexTheme {
    val colors: PokedexColorScheme
        @Composable
        get() = LocalPokedexColorScheme.current
}

@Composable
fun PokedexTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        extendedDark
    } else {
        extendedLight
    }

    val composedColorScheme = colorScheme.toColorScheme()

    CompositionLocalProvider(LocalPokedexColorScheme provides colorScheme) {
        MaterialTheme(
            colorScheme = composedColorScheme,
            typography = AppTypography,
            content = content
        )
    }
}

fun PokedexColorScheme.toColorScheme(): ColorScheme {
    return if (this == extendedLight) {
        lightColorScheme(
            primary = watterButton,
            onPrimary = watterButton,
            primaryContainer = watterButton,
            onPrimaryContainer = watterButton,
            secondary = allTypesButton,
            onSecondary = allTypesButton,
            secondaryContainer = allTypesButton,
            onSecondaryContainer = allTypesButton,
            tertiary = dragonButton,
            onTertiary = dragonButton,
            tertiaryContainer = dragonButton,
            onTertiaryContainer = dragonButton,
            background = background,
            onBackground = background,
            surface = surfaceLight,
            onSurface = surfaceLight
        )
    } else {
        darkColorScheme(
            primary = watterButton,
            onPrimary = watterButton,
            primaryContainer = watterButton,
            onPrimaryContainer = watterButton,
            secondary = allTypesButton,
            onSecondary = allTypesButton,
            secondaryContainer = allTypesButton,
            onSecondaryContainer = allTypesButton,
            tertiary = dragonButton,
            onTertiary = dragonButton,
            tertiaryContainer = dragonButton,
            onTertiaryContainer = dragonButton,
            background = background,
            onBackground = background,
            surface = surfaceDark,
            onSurface = surfaceDark
        )
    }
}
