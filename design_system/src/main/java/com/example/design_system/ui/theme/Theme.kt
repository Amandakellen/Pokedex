package com.example.design_system.ui.theme

import android.app.Activity
import android.graphics.Color
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.example.ui.theme.AppTypography

@Immutable
data class PokedexColorScheme(
    val watterButton: ColorFamily,
    val allTypesButton: ColorFamily,
    val dragonButton: ColorFamily,
    val eletricButton: ColorFamily,
    val fairyButton: ColorFamily,
    val ghostButton: ColorFamily,
    val fireButton: ColorFamily,
    val iceButton: ColorFamily,
    val grassButton: ColorFamily,
    val bugButton: ColorFamily,
    val fightingButton: ColorFamily,
    val normalButton: ColorFamily,
    val darkButton: ColorFamily,
    val customColor1: ColorFamily,
)

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

val extendedLight = PokedexColorScheme(
    watterButton = ColorFamily(
        watterButtonLight,
        onWatterButtonLight,
        watterButtonContainerLight,
        onWatterButtonContainerLight,
    ),
    allTypesButton = ColorFamily(
        allTypesButtonLight,
        onAllTypesButtonLight,
        allTypesButtonContainerLight,
        onAllTypesButtonContainerLight,
    ),
    dragonButton = ColorFamily(
        dragonButtonLight,
        onDragonButtonLight,
        dragonButtonContainerLight,
        onDragonButtonContainerLight,
    ),
    eletricButton = ColorFamily(
        eletricButtonLight,
        onEletricButtonLight,
        eletricButtonContainerLight,
        onEletricButtonContainerLight,
    ),
    fairyButton = ColorFamily(
        fairyButtonLight,
        onFairyButtonLight,
        fairyButtonContainerLight,
        onFairyButtonContainerLight,
    ),
    ghostButton = ColorFamily(
        ghostButtonLight,
        onGhostButtonLight,
        ghostButtonContainerLight,
        onGhostButtonContainerLight,
    ),
    fireButton = ColorFamily(
        fireButtonLight,
        onFireButtonLight,
        fireButtonContainerLight,
        onFireButtonContainerLight,
    ),
    iceButton = ColorFamily(
        iceButtonLight,
        onIceButtonLight,
        iceButtonContainerLight,
        onIceButtonContainerLight,
    ),
    grassButton = ColorFamily(
        grassButtonLight,
        onGrassButtonLight,
        grassButtonContainerLight,
        onGrassButtonContainerLight,
    ),
    bugButton = ColorFamily(
        bugButtonLight,
        onBugButtonLight,
        bugButtonContainerLight,
        onBugButtonContainerLight,
    ),
    fightingButton = ColorFamily(
        fightingButtonLight,
        onFightingButtonLight,
        fightingButtonContainerLight,
        onFightingButtonContainerLight,
    ),
    normalButton = ColorFamily(
        normalButtonLight,
        onNormalButtonLight,
        normalButtonContainerLight,
        onNormalButtonContainerLight,
    ),
    darkButton = ColorFamily(
        darkButtonLight,
        onDarkButtonLight,
        darkButtonContainerLight,
        onDarkButtonContainerLight,
    ),
    customColor1 = ColorFamily(
        customColor1Light,
        onCustomColor1Light,
        customColor1ContainerLight,
        onCustomColor1ContainerLight,
    ),
)

val extendedDark = PokedexColorScheme(
    watterButton = ColorFamily(
        watterButtonDark,
        onWatterButtonDark,
        watterButtonContainerDark,
        onWatterButtonContainerDark,
    ),
    allTypesButton = ColorFamily(
        allTypesButtonDark,
        onAllTypesButtonDark,
        allTypesButtonContainerDark,
        onAllTypesButtonContainerDark,
    ),
    dragonButton = ColorFamily(
        dragonButtonDark,
        onDragonButtonDark,
        dragonButtonContainerDark,
        onDragonButtonContainerDark,
    ),
    eletricButton = ColorFamily(
        eletricButtonDark,
        onEletricButtonDark,
        eletricButtonContainerDark,
        onEletricButtonContainerDark,
    ),
    fairyButton = ColorFamily(
        fairyButtonDark,
        onFairyButtonDark,
        fairyButtonContainerDark,
        onFairyButtonContainerDark,
    ),
    ghostButton = ColorFamily(
        ghostButtonDark,
        onGhostButtonDark,
        ghostButtonContainerDark,
        onGhostButtonContainerDark,
    ),
    fireButton = ColorFamily(
        fireButtonDark,
        onFireButtonDark,
        fireButtonContainerDark,
        onFireButtonContainerDark,
    ),
    iceButton = ColorFamily(
        iceButtonDark,
        onIceButtonDark,
        iceButtonContainerDark,
        onIceButtonContainerDark,
    ),
    grassButton = ColorFamily(
        grassButtonDark,
        onGrassButtonDark,
        grassButtonContainerDark,
        onGrassButtonContainerDark,
    ),
    bugButton = ColorFamily(
        bugButtonDark,
        onBugButtonDark,
        bugButtonContainerDark,
        onBugButtonContainerDark,
    ),
    fightingButton = ColorFamily(
        fightingButtonDark,
        onFightingButtonDark,
        fightingButtonContainerDark,
        onFightingButtonContainerDark,
    ),
    normalButton = ColorFamily(
        normalButtonDark,
        onNormalButtonDark,
        normalButtonContainerDark,
        onNormalButtonContainerDark,
    ),
    darkButton = ColorFamily(
        darkButtonDark,
        onDarkButtonDark,
        darkButtonContainerDark,
        onDarkButtonContainerDark,
    ),
    customColor1 = ColorFamily(
        customColor1Dark,
        onCustomColor1Dark,
        customColor1ContainerDark,
        onCustomColor1ContainerDark,
    ),
)

val extendedLightMediumContrast = PokedexColorScheme(
    watterButton = ColorFamily(
        watterButtonLightMediumContrast,
        onWatterButtonLightMediumContrast,
        watterButtonContainerLightMediumContrast,
        onWatterButtonContainerLightMediumContrast,
    ),
    allTypesButton = ColorFamily(
        allTypesButtonLightMediumContrast,
        onAllTypesButtonLightMediumContrast,
        allTypesButtonContainerLightMediumContrast,
        onAllTypesButtonContainerLightMediumContrast,
    ),
    dragonButton = ColorFamily(
        dragonButtonLightMediumContrast,
        onDragonButtonLightMediumContrast,
        dragonButtonContainerLightMediumContrast,
        onDragonButtonContainerLightMediumContrast,
    ),
    eletricButton = ColorFamily(
        eletricButtonLightMediumContrast,
        onEletricButtonLightMediumContrast,
        eletricButtonContainerLightMediumContrast,
        onEletricButtonContainerLightMediumContrast,
    ),
    fairyButton = ColorFamily(
        fairyButtonLightMediumContrast,
        onFairyButtonLightMediumContrast,
        fairyButtonContainerLightMediumContrast,
        onFairyButtonContainerLightMediumContrast,
    ),
    ghostButton = ColorFamily(
        ghostButtonLightMediumContrast,
        onGhostButtonLightMediumContrast,
        ghostButtonContainerLightMediumContrast,
        onGhostButtonContainerLightMediumContrast,
    ),
    fireButton = ColorFamily(
        fireButtonLightMediumContrast,
        onFireButtonLightMediumContrast,
        fireButtonContainerLightMediumContrast,
        onFireButtonContainerLightMediumContrast,
    ),
    iceButton = ColorFamily(
        iceButtonLightMediumContrast,
        onIceButtonLightMediumContrast,
        iceButtonContainerLightMediumContrast,
        onIceButtonContainerLightMediumContrast,
    ),
    grassButton = ColorFamily(
        grassButtonLightMediumContrast,
        onGrassButtonLightMediumContrast,
        grassButtonContainerLightMediumContrast,
        onGrassButtonContainerLightMediumContrast,
    ),
    bugButton = ColorFamily(
        bugButtonLightMediumContrast,
        onBugButtonLightMediumContrast,
        bugButtonContainerLightMediumContrast,
        onBugButtonContainerLightMediumContrast,
    ),
    fightingButton = ColorFamily(
        fightingButtonLightMediumContrast,
        onFightingButtonLightMediumContrast,
        fightingButtonContainerLightMediumContrast,
        onFightingButtonContainerLightMediumContrast,
    ),
    normalButton = ColorFamily(
        normalButtonLightMediumContrast,
        onNormalButtonLightMediumContrast,
        normalButtonContainerLightMediumContrast,
        onNormalButtonContainerLightMediumContrast,
    ),
    darkButton = ColorFamily(
        darkButtonLightMediumContrast,
        onDarkButtonLightMediumContrast,
        darkButtonContainerLightMediumContrast,
        onDarkButtonContainerLightMediumContrast,
    ),
    customColor1 = ColorFamily(
        customColor1LightMediumContrast,
        onCustomColor1LightMediumContrast,
        customColor1ContainerLightMediumContrast,
        onCustomColor1ContainerLightMediumContrast,
    ),
)

val extendedLightHighContrast = PokedexColorScheme(
    watterButton = ColorFamily(
        watterButtonLightHighContrast,
        onWatterButtonLightHighContrast,
        watterButtonContainerLightHighContrast,
        onWatterButtonContainerLightHighContrast,
    ),
    allTypesButton = ColorFamily(
        allTypesButtonLightHighContrast,
        onAllTypesButtonLightHighContrast,
        allTypesButtonContainerLightHighContrast,
        onAllTypesButtonContainerLightHighContrast,
    ),
    dragonButton = ColorFamily(
        dragonButtonLightHighContrast,
        onDragonButtonLightHighContrast,
        dragonButtonContainerLightHighContrast,
        onDragonButtonContainerLightHighContrast,
    ),
    eletricButton = ColorFamily(
        eletricButtonLightHighContrast,
        onEletricButtonLightHighContrast,
        eletricButtonContainerLightHighContrast,
        onEletricButtonContainerLightHighContrast,
    ),
    fairyButton = ColorFamily(
        fairyButtonLightHighContrast,
        onFairyButtonLightHighContrast,
        fairyButtonContainerLightHighContrast,
        onFairyButtonContainerLightHighContrast,
    ),
    ghostButton = ColorFamily(
        ghostButtonLightHighContrast,
        onGhostButtonLightHighContrast,
        ghostButtonContainerLightHighContrast,
        onGhostButtonContainerLightHighContrast,
    ),
    fireButton = ColorFamily(
        fireButtonLightHighContrast,
        onFireButtonLightHighContrast,
        fireButtonContainerLightHighContrast,
        onFireButtonContainerLightHighContrast,
    ),
    iceButton = ColorFamily(
        iceButtonLightHighContrast,
        onIceButtonLightHighContrast,
        iceButtonContainerLightHighContrast,
        onIceButtonContainerLightHighContrast,
    ),
    grassButton = ColorFamily(
        grassButtonLightHighContrast,
        onGrassButtonLightHighContrast,
        grassButtonContainerLightHighContrast,
        onGrassButtonContainerLightHighContrast,
    ),
    bugButton = ColorFamily(
        bugButtonLightHighContrast,
        onBugButtonLightHighContrast,
        bugButtonContainerLightHighContrast,
        onBugButtonContainerLightHighContrast,
    ),
    fightingButton = ColorFamily(
        fightingButtonLightHighContrast,
        onFightingButtonLightHighContrast,
        fightingButtonContainerLightHighContrast,
        onFightingButtonContainerLightHighContrast,
    ),
    normalButton = ColorFamily(
        normalButtonLightHighContrast,
        onNormalButtonLightHighContrast,
        normalButtonContainerLightHighContrast,
        onNormalButtonContainerLightHighContrast,
    ),
    darkButton = ColorFamily(
        darkButtonLightHighContrast,
        onDarkButtonLightHighContrast,
        darkButtonContainerLightHighContrast,
        onDarkButtonContainerLightHighContrast,
    ),
    customColor1 = ColorFamily(
        customColor1LightHighContrast,
        onCustomColor1LightHighContrast,
        customColor1ContainerLightHighContrast,
        onCustomColor1ContainerLightHighContrast,
    ),
)

val extendedDarkMediumContrast = PokedexColorScheme(
    watterButton = ColorFamily(
        watterButtonDarkMediumContrast,
        onWatterButtonDarkMediumContrast,
        watterButtonContainerDarkMediumContrast,
        onWatterButtonContainerDarkMediumContrast,
    ),
    allTypesButton = ColorFamily(
        allTypesButtonDarkMediumContrast,
        onAllTypesButtonDarkMediumContrast,
        allTypesButtonContainerDarkMediumContrast,
        onAllTypesButtonContainerDarkMediumContrast,
    ),
    dragonButton = ColorFamily(
        dragonButtonDarkMediumContrast,
        onDragonButtonDarkMediumContrast,
        dragonButtonContainerDarkMediumContrast,
        onDragonButtonContainerDarkMediumContrast,
    ),
    eletricButton = ColorFamily(
        eletricButtonDarkMediumContrast,
        onEletricButtonDarkMediumContrast,
        eletricButtonContainerDarkMediumContrast,
        onEletricButtonContainerDarkMediumContrast,
    ),
    fairyButton = ColorFamily(
        fairyButtonDarkMediumContrast,
        onFairyButtonDarkMediumContrast,
        fairyButtonContainerDarkMediumContrast,
        onFairyButtonContainerDarkMediumContrast,
    ),
    ghostButton = ColorFamily(
        ghostButtonDarkMediumContrast,
        onGhostButtonDarkMediumContrast,
        ghostButtonContainerDarkMediumContrast,
        onGhostButtonContainerDarkMediumContrast,
    ),
    fireButton = ColorFamily(
        fireButtonDarkMediumContrast,
        onFireButtonDarkMediumContrast,
        fireButtonContainerDarkMediumContrast,
        onFireButtonContainerDarkMediumContrast,
    ),
    iceButton = ColorFamily(
        iceButtonDarkMediumContrast,
        onIceButtonDarkMediumContrast,
        iceButtonContainerDarkMediumContrast,
        onIceButtonContainerDarkMediumContrast,
    ),
    grassButton = ColorFamily(
        grassButtonDarkMediumContrast,
        onGrassButtonDarkMediumContrast,
        grassButtonContainerDarkMediumContrast,
        onGrassButtonContainerDarkMediumContrast,
    ),
    bugButton = ColorFamily(
        bugButtonDarkMediumContrast,
        onBugButtonDarkMediumContrast,
        bugButtonContainerDarkMediumContrast,
        onBugButtonContainerDarkMediumContrast,
    ),
    fightingButton = ColorFamily(
        fightingButtonDarkMediumContrast,
        onFightingButtonDarkMediumContrast,
        fightingButtonContainerDarkMediumContrast,
        onFightingButtonContainerDarkMediumContrast,
    ),
    normalButton = ColorFamily(
        normalButtonDarkMediumContrast,
        onNormalButtonDarkMediumContrast,
        normalButtonContainerDarkMediumContrast,
        onNormalButtonContainerDarkMediumContrast,
    ),
    darkButton = ColorFamily(
        darkButtonDarkMediumContrast,
        onDarkButtonDarkMediumContrast,
        darkButtonContainerDarkMediumContrast,
        onDarkButtonContainerDarkMediumContrast,
    ),
    customColor1 = ColorFamily(
        customColor1DarkMediumContrast,
        onCustomColor1DarkMediumContrast,
        customColor1ContainerDarkMediumContrast,
        onCustomColor1ContainerDarkMediumContrast,
    ),
)

val extendedDarkHighContrast = PokedexColorScheme(
    watterButton = ColorFamily(
        watterButtonDarkHighContrast,
        onWatterButtonDarkHighContrast,
        watterButtonContainerDarkHighContrast,
        onWatterButtonContainerDarkHighContrast,
    ),
    allTypesButton = ColorFamily(
        allTypesButtonDarkHighContrast,
        onAllTypesButtonDarkHighContrast,
        allTypesButtonContainerDarkHighContrast,
        onAllTypesButtonContainerDarkHighContrast,
    ),
    dragonButton = ColorFamily(
        dragonButtonDarkHighContrast,
        onDragonButtonDarkHighContrast,
        dragonButtonContainerDarkHighContrast,
        onDragonButtonContainerDarkHighContrast,
    ),
    eletricButton = ColorFamily(
        eletricButtonDarkHighContrast,
        onEletricButtonDarkHighContrast,
        eletricButtonContainerDarkHighContrast,
        onEletricButtonContainerDarkHighContrast,
    ),
    fairyButton = ColorFamily(
        fairyButtonDarkHighContrast,
        onFairyButtonDarkHighContrast,
        fairyButtonContainerDarkHighContrast,
        onFairyButtonContainerDarkHighContrast,
    ),
    ghostButton = ColorFamily(
        ghostButtonDarkHighContrast,
        onGhostButtonDarkHighContrast,
        ghostButtonContainerDarkHighContrast,
        onGhostButtonContainerDarkHighContrast,
    ),
    fireButton = ColorFamily(
        fireButtonDarkHighContrast,
        onFireButtonDarkHighContrast,
        fireButtonContainerDarkHighContrast,
        onFireButtonContainerDarkHighContrast,
    ),
    iceButton = ColorFamily(
        iceButtonDarkHighContrast,
        onIceButtonDarkHighContrast,
        iceButtonContainerDarkHighContrast,
        onIceButtonContainerDarkHighContrast,
    ),
    grassButton = ColorFamily(
        grassButtonDarkHighContrast,
        onGrassButtonDarkHighContrast,
        grassButtonContainerDarkHighContrast,
        onGrassButtonContainerDarkHighContrast,
    ),
    bugButton = ColorFamily(
        bugButtonDarkHighContrast,
        onBugButtonDarkHighContrast,
        bugButtonContainerDarkHighContrast,
        onBugButtonContainerDarkHighContrast,
    ),
    fightingButton = ColorFamily(
        fightingButtonDarkHighContrast,
        onFightingButtonDarkHighContrast,
        fightingButtonContainerDarkHighContrast,
        onFightingButtonContainerDarkHighContrast,
    ),
    normalButton = ColorFamily(
        normalButtonDarkHighContrast,
        onNormalButtonDarkHighContrast,
        normalButtonContainerDarkHighContrast,
        onNormalButtonContainerDarkHighContrast,
    ),
    darkButton = ColorFamily(
        darkButtonDarkHighContrast,
        onDarkButtonDarkHighContrast,
        darkButtonContainerDarkHighContrast,
        onDarkButtonContainerDarkHighContrast,
    ),
    customColor1 = ColorFamily(
        customColor1DarkHighContrast,
        onCustomColor1DarkHighContrast,
        customColor1ContainerDarkHighContrast,
        onCustomColor1ContainerDarkHighContrast,
    ),
)

@Immutable
data class ColorFamily(
    val color: androidx.compose.ui.graphics.Color,
    val onColor: androidx.compose.ui.graphics.Color,
    val colorContainer: androidx.compose.ui.graphics.Color,
    val onColorContainer: androidx.compose.ui.graphics.Color
)

@Composable
fun PokedexTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable() () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> darkScheme
        else -> lightScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        content = content
    )
}