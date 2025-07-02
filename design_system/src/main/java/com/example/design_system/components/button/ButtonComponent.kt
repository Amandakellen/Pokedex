package com.example.design_system.components.button

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.example.design_system.theme.PokedexTheme
import com.example.design_system.theme.dark_themes.PokedexContextDark
import com.example.design_system.theme.light_theme.PokedexContextLight

@PreviewLightDark
@Composable
fun GeneralButtonsPreview() {
    PokedexTheme {
        Column {
            ButtonComponent(label = "Primary", style = ButtonStyle.Primary, onClick = {})
            ButtonComponent(label = "Secondary", style = ButtonStyle.Secondary, onClick = {})
            ButtonComponent(label = "AllTypes", style = ButtonStyle.AllTypes, onClick = {})
        }

    }
}

@PreviewLightDark
@Composable
fun EarthButtonsPreview() {
    PokedexTheme {
        Column {
            ButtonComponent(label = "Ground", style = ButtonStyle.Ground, onClick = {})
            ButtonComponent(label = "Rock", style = ButtonStyle.Rock, onClick = {})
            ButtonComponent(label = "Poison", style = ButtonStyle.Poison, onClick = {})
            ButtonComponent(label = "Steel", style = ButtonStyle.Metal, onClick = {})
            ButtonComponent(label = "Fighting", style = ButtonStyle.Fighting, onClick = {})
        }
    }
}

@PreviewLightDark
@Composable
fun WaterButtonsPreview() {
    PokedexTheme {
        Column {
            ButtonComponent(label = "Water", style = ButtonStyle.Watter, onClick = {})
            ButtonComponent(label = "Ice", style = ButtonStyle.Ice, onClick = {})
            ButtonComponent(label = "Bug", style = ButtonStyle.Bug, onClick = {})
        }
    }
}

@PreviewLightDark
@Composable
fun AirButtonsPreview() {
    PokedexTheme {
        Column {
            ButtonComponent(label = "Flying", style = ButtonStyle.Flying, onClick = {})
            ButtonComponent(label = "Dragon", style = ButtonStyle.Dragon, onClick = {})
            ButtonComponent(label = "Fairy", style = ButtonStyle.Fairy, onClick = {})
            ButtonComponent(label = "Psychic", style = ButtonStyle.Psychic, onClick = {})
        }
    }
}

@PreviewLightDark
@Composable
fun IconButtonsPreview() {
    PokedexTheme {
        Column {
            ButtonComponent(
                label = "Continuar com o google",
                style = ButtonStyle.Secondary,
                onClick = {})
        }
    }
}


@Composable
fun ButtonComponent(
    modifier: Modifier = Modifier,
    label: String,
    style: ButtonStyle,
    onClick: () -> Unit,
    leftIcon: Int? = null,
) {
    val buttonColors = ButtonDefaults.buttonColors(
        containerColor = style.background,
        contentColor = style.textColor
    )


    Button(
        modifier = modifier
            .fillMaxWidth(),
        onClick = onClick,
        shape = RoundedCornerShape(PokedexTheme.padding.superLarge),
        colors = buttonColors
    ) {
        leftIcon?.let {
            Icon(
                painter = painterResource(id = it),
                contentDescription = null
            )
        }
        Text(
            text = label,
            style = TextStyle(fontSize = style.textSize),
            fontWeight = style.fontWeight,
        )
    }

}
