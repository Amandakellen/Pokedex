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

    object Primary: ButtonStyle{
        override val textColor: Color
        @Composable
        get() = PokedexTheme.primaryButtonTextColor
        override val textSize: TextUnit
        @Composable
        get() = 14.sp
        override val background: Color
        @Composable
        get() = PokedexTheme.primaryButton
    }

    object Secondary: ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.primaryButton
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.secondaryButton
    }


    object Watter: ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.whiteText
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

    object Fire : ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.blackText
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.fireButton

    }

    object  Ice : ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.blackText
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.iceButton

    }

    object Grass: ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.blackText
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.grassButton

    }

    object Bug : ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.blackText
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.bugButton
    }

    object Fighting : ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.whiteText
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.fightingButton
    }

    object Normal : ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.blackText
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.normalButton
    }

    object Dark : ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.whiteText
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.darkButton
    }

    object Metal : ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.blackText
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.metalButton
    }

    object Rock : ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.blackText
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.rockButton
    }

    object Psychic : ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.blackText
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.psychicButton
    }

    object Ground : ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.blackText
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.groundButton
    }

    object Poison : ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.blackText
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.poisonButton
    }

    object Flying : ButtonStyle{
        override val textColor: Color
            @Composable
            get() = PokedexTheme.blackText
        override val textSize: TextUnit
            @Composable
            get() = 14.sp
        override val background: Color
            @Composable
            get() = PokedexTheme.flyingButton
    }

}