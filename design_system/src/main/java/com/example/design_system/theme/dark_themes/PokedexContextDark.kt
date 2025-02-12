package com.example.design_system.theme.dark_themes

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.example.design_system.theme.PokedexContext
import com.example.design_system.theme.colors.allTypesButtonDark
import com.example.design_system.theme.colors.bugButtonDark
import com.example.design_system.theme.colors.customColor1Dark
import com.example.design_system.theme.colors.darkButtonDark
import com.example.design_system.theme.colors.dragonButtonDark
import com.example.design_system.theme.colors.eletricButtonDark
import com.example.design_system.theme.colors.fairyButtonDark
import com.example.design_system.theme.colors.fightingButtonDark
import com.example.design_system.theme.colors.fireButtonDark
import com.example.design_system.theme.colors.ghostButtonDark
import com.example.design_system.theme.colors.grassButtonDark
import com.example.design_system.theme.colors.iceButtonDark
import com.example.design_system.theme.colors.normalButtonDark
import com.example.design_system.theme.colors.onPrimaryDarkHighContrast
import com.example.design_system.theme.colors.primaryContainerLight
import com.example.design_system.theme.colors.surfaceContainerLight
import com.example.design_system.theme.colors.surfaceContainerLowestDark
import com.example.design_system.theme.colors.watterButtonDark

@Immutable
object PokedexContextDark : PokedexContext {
    override val watterButton = watterButtonDark
    override val allTypesButton = allTypesButtonDark
    override val dragonButton = dragonButtonDark
    override val eletricButton = eletricButtonDark
    override val fairyButton = fairyButtonDark
    override val ghostButton = ghostButtonDark
    override val fireButton = fireButtonDark
    override val iceButton = iceButtonDark
    override val grassButton = grassButtonDark
    override val bugButton = bugButtonDark
    override val fightingButton = fightingButtonDark
    override val normalButton = normalButtonDark
    override val darkButton = darkButtonDark
    override val customColor1 = customColor1Dark
    override val background = onPrimaryDarkHighContrast
    override val text = surfaceContainerLight
    override val primaryButton = primaryContainerLight
    override val secondaryButton = onPrimaryDarkHighContrast
    override val primaryButtonTextColor = surfaceContainerLowestDark

}