package com.example.design_system.components.button

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.design_system.theme.PokedexTheme


@Stable
sealed interface ButtonStyle {
    val textColor @Composable get() = PokedexTheme.primaryButtonTextColor
    val textSize  @Composable get() = 18.sp
    val background @Composable get() = PokedexTheme.primaryButton

    object Primary: ButtonStyle

    object Watter: ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.blackText
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.watterButton

    }

    object AllTypes: ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.whiteText
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.allTypesButton

    }

    object Dragon: ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.whiteText
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.dragonButton

    }

    object Eletric: ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.blackText
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.eletricButton

    }

    object Fairy: ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.blackText
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.fairyButton

    }

    object Ghost: ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.whiteText
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.ghostButton

    }


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