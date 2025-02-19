package com.example.design_system.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.example.design_system.theme.colors.allTypesButtonDark
import com.example.design_system.theme.colors.allTypesButtonLight
import com.example.design_system.theme.colors.bugButtonDark
import com.example.design_system.theme.colors.bugButtonLight
import com.example.design_system.theme.colors.customColor1Dark
import com.example.design_system.theme.colors.customColor1Light
import com.example.design_system.theme.colors.darkButtonDark
import com.example.design_system.theme.colors.darkButtonLight
import com.example.design_system.theme.colors.dragonButtonDark
import com.example.design_system.theme.colors.dragonButtonLight
import com.example.design_system.theme.colors.eletricButtonDark
import com.example.design_system.theme.colors.eletricButtonLight
import com.example.design_system.theme.colors.fairyButtonDark
import com.example.design_system.theme.colors.fairyButtonLight
import com.example.design_system.theme.colors.fightingButtonDark
import com.example.design_system.theme.colors.fightingButtonLight
import com.example.design_system.theme.colors.fireButtonDark
import com.example.design_system.theme.colors.fireButtonLight
import com.example.design_system.theme.colors.ghostButtonDark
import com.example.design_system.theme.colors.ghostButtonLight
import com.example.design_system.theme.colors.grassButtonDark
import com.example.design_system.theme.colors.grassButtonLight
import com.example.design_system.theme.colors.iceButtonDark
import com.example.design_system.theme.colors.iceButtonLight
import com.example.design_system.theme.colors.normalButtonDark
import com.example.design_system.theme.colors.normalButtonLight
import com.example.design_system.theme.colors.onPrimaryDarkHighContrast
import com.example.design_system.theme.colors.onPrimaryLightHighContrast
import com.example.design_system.theme.colors.onSecondaryLight
import com.example.design_system.theme.colors.scrimLight
import com.example.design_system.theme.colors.surfaceContainerDark
import com.example.design_system.theme.colors.surfaceContainerLight
import com.example.design_system.theme.colors.surfaceDark
import com.example.design_system.theme.colors.surfaceLight
import com.example.design_system.theme.colors.watterButtonDark
import com.example.design_system.theme.colors.watterButtonLight
import com.example.design_system.theme.dark_themes.PokedexContextDark
import com.example.design_system.theme.light_theme.PokedexContextLight

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

@Composable
fun PokedexTheme(
    context: PokedexContext = systemContext(),
    content: @Composable () -> Unit
) {
    val colorScheme = extendedLight

    val composedColorScheme = colorScheme.toColorScheme()

    CompositionLocalProvider(
        LocalWatterButton provides context.watterButton,
        LocalAllTypesButton provides context.allTypesButton,
        LocalDragonButton provides context.dragonButton,
        LocalEletricButton provides context.eletricButton,
        LocalFairyButton provides context.fairyButton,
        LocalGhostButton provides context.ghostButton,
        LocalFireButton provides context.fireButton,
        LocalIceButton provides context.iceButton,
        LocalGrassButton provides context.grassButton,
        LocalBugButton provides context.bugButton,
        LocalFightingButton provides context.fightingButton,
        LocalNormalButton provides context.normalButton,
        LocalDarkButton provides context.darkButton,
        LocalCustomColor1 provides context.customColor1,
        LocalBackground provides context.background,
        LocalText provides context.text,
        LocalPrimaryButton provides context.primaryButton,
        LocalSecondaryButton provides context.secondaryButton,
        LocalPrimaryButtonTextColor provides context.primaryButtonTextColor,
        LocalMetalButton provides context.metalButton,
        LocalRockButton provides context.rockButton,
        LocalPsychicButton provides context.psychicButton,
        LocalGroundButton provides context.groundButton,
        LocalPoisonButton provides context.poisonButton,
        LocalFlyingButton provides context.flyingButton

    ) {
        MaterialTheme(
            colorScheme = composedColorScheme,
            typography = AppTypography,
            content = content
        )
    }
}

@Composable
fun systemContext(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
): PokedexContext {
    return if (isDarkTheme) {
        PokedexContextDark
    } else {
        PokedexContextLight
    }
}


object PokedexTheme {
    val watterButton: Color
        @Composable
        get() = LocalWatterButton.current

    val allTypesButton: Color
        @Composable
        get() = LocalAllTypesButton.current

    val dragonButton: Color
        @Composable
        get() = LocalDragonButton.current

    val eletricButton: Color
        @Composable
        get() = LocalEletricButton.current

    val fairyButton: Color
        @Composable
        get() = LocalFairyButton.current

    val ghostButton: Color
        @Composable
        get() = LocalGhostButton.current

    val fireButton: Color
        @Composable
        get() = LocalFireButton.current

    val iceButton: Color
        @Composable
        get() = LocalIceButton.current
    val grassButton: Color
        @Composable
        get() = LocalGrassButton.current
    val bugButton: Color
        @Composable
        get() = LocalBugButton.current
    val fightingButton: Color
        @Composable
        get() = LocalFightingButton.current
    val normalButton: Color
        @Composable
        get() = LocalNormalButton.current
    val darkButton: Color
        @Composable
        get() = LocalDarkButton.current
    val customColor1: Color
        @Composable
        get() = LocalCustomColor1.current
    val background: Color
        @Composable
        get() = LocalBackground.current
    val text: Color
        @Composable
        get() = LocalText.current
    val primaryButton: Color
        @Composable
        get() = LocalPrimaryButton.current
    val secondaryButton: Color
        @Composable
        get() = LocalSecondaryButton.current
    val metalButton: Color
        @Composable
        get() = LocalMetalButton.current

    val rockButton: Color
        @Composable
        get() = LocalRockButton.current

    val psychicButton: Color
        @Composable
        get() = LocalPsychicButton.current

    val groundButton: Color
        @Composable
        get() = LocalGroundButton.current

    val poisonButton: Color
        @Composable
        get() = LocalPoisonButton.current

    val flyingButton: Color
        @Composable
        get() = LocalFlyingButton.current

    val primaryButtonTextColor: Color
        @Composable
        get() = LocalPrimaryButtonTextColor.current

    val blackText: Color
        @Composable
        get() = scrimLight

    val whiteText: Color
        @Composable
        get() = onSecondaryLight
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
