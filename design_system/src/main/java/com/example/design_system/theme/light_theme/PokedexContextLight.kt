package com.example.design_system.theme.light_theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.example.design_system.data.Spacing
import com.example.design_system.theme.PokedexContext
import com.example.design_system.theme.colors.allTypesButtonLight
import com.example.design_system.theme.colors.bugButtonLight
import com.example.design_system.theme.colors.customColor1Light
import com.example.design_system.theme.colors.darkButtonLight
import com.example.design_system.theme.colors.disableButtonLight
import com.example.design_system.theme.colors.dragonButtonLight
import com.example.design_system.theme.colors.eletricButtonLight
import com.example.design_system.theme.colors.fairyButtonLight
import com.example.design_system.theme.colors.fightingButtonLight
import com.example.design_system.theme.colors.fireButtonLight
import com.example.design_system.theme.colors.flyingButtonLight
import com.example.design_system.theme.colors.ghostButtonLight
import com.example.design_system.theme.colors.grassButtonLight
import com.example.design_system.theme.colors.groundButtonLight
import com.example.design_system.theme.colors.iceButtonLight
import com.example.design_system.theme.colors.linkColorDark
import com.example.design_system.theme.colors.linkColorLight
import com.example.design_system.theme.colors.metalButtonLight
import com.example.design_system.theme.colors.normalButtonLight
import com.example.design_system.theme.colors.onPrimaryLight
import com.example.design_system.theme.colors.onPrimaryLightHighContrast
import com.example.design_system.theme.colors.poisonButtonLight
import com.example.design_system.theme.colors.primaryLightHighContrast
import com.example.design_system.theme.colors.psychicButtonLight
import com.example.design_system.theme.colors.rockButtonLight
import com.example.design_system.theme.colors.surfaceContainerDark
import com.example.design_system.theme.colors.watterButtonLight

@Immutable
object PokedexContextLight : PokedexContext {
    override val watterButton = watterButtonLight
    override val allTypesButton = allTypesButtonLight
    override val dragonButton = dragonButtonLight
    override val eletricButton = eletricButtonLight
    override val fairyButton = fairyButtonLight
    override val ghostButton = ghostButtonLight
    override val fireButton = fireButtonLight
    override val iceButton = iceButtonLight
    override val grassButton = grassButtonLight
    override val bugButton = bugButtonLight
    override val fightingButton = fightingButtonLight
    override val normalButton = normalButtonLight
    override val darkButton = darkButtonLight
    override val customColor1 = customColor1Light
    override val background = onPrimaryLightHighContrast
    override val text = surfaceContainerDark
    override val primaryButton = primaryLightHighContrast
    override val secondaryButton = onPrimaryLight
    override val primaryButtonTextColor = onPrimaryLight
    override val metalButton = metalButtonLight
    override val rockButton = rockButtonLight
    override val psychicButton = psychicButtonLight
    override val groundButton = groundButtonLight
    override val poisonButton = poisonButtonLight
    override val flyingButton = flyingButtonLight
    override val disableButton = disableButtonLight
    override val linkColor = linkColorLight
    override val padding =  Spacing()
}
