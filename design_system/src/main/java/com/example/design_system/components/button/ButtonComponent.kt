package com.example.design_system.components.button

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.design_system.theme.PokedexTheme
import com.example.design_system.theme.dark_themes.PokedexContextDark
import com.example.design_system.theme.light_theme.PokedexContextLight

@Preview(name = "General Light Buttons", showBackground = true)
@Composable
fun GeneralButtonsLightPreview() {
    PokedexTheme(context = PokedexContextLight) {
        Column{
            ButtonComponent(label = "Primary", style = ButtonStyle.Primary, onClick = {})
            ButtonComponent(label = "Secondary", style = ButtonStyle.Secondary, onClick = {})
            ButtonComponent(label = "AllTypes", style = ButtonStyle.AllTypes, onClick = {})
        }

    }
}

@Preview(name = "Earth Light Buttons", showBackground = true)
@Composable
fun EarthButtonsPreview() {
    Column {
        ButtonComponent(label = "Ground", style = ButtonStyle.Ground, onClick = {})
        ButtonComponent(label = "Rock", style = ButtonStyle.Rock, onClick = {})
        ButtonComponent(label = "Poison", style = ButtonStyle.Poison, onClick = {})
        ButtonComponent(label = "Steel", style = ButtonStyle.Metal, onClick = {})
        ButtonComponent(label = "Fighting", style = ButtonStyle.Fighting, onClick = {})
    }
}

@Preview(name = "Water Light Buttons", showBackground = true)
@Composable
fun WaterButtonsLightPreview() {
    Column {
        ButtonComponent(label = "Water", style = ButtonStyle.Watter, onClick = {})
        ButtonComponent(label = "Ice", style = ButtonStyle.Ice, onClick = {})
        ButtonComponent(label = "Bug", style = ButtonStyle.Bug, onClick = {})
    }
}

@Preview(name = "Air Light Buttons", showBackground = true)
@Composable
fun AirButtonsLightPreview() {
    Column {
        ButtonComponent(label = "Flying", style = ButtonStyle.Flying, onClick = {})
        ButtonComponent(label = "Dragon", style = ButtonStyle.Dragon, onClick = {})
        ButtonComponent(label = "Fairy", style = ButtonStyle.Fairy, onClick = {})
        ButtonComponent(label = "Psychic", style = ButtonStyle.Psychic, onClick = {})
    }
}

@Preview(name = "General Dark Buttons", showBackground = true, backgroundColor = 0xFF121212)
@Composable
fun GeneralButtonsDarkPreview() {
    PokedexTheme(context = PokedexContextDark) {
        Column {
            ButtonComponent(label = "Primary", style = ButtonStyle.Primary, onClick = {})
            ButtonComponent(label = "Secondary", style = ButtonStyle.Secondary, onClick = {})
            ButtonComponent(label = "AllTypes", style = ButtonStyle.AllTypes, onClick = {})
        }
    }
}

@Preview(name = "Earth Dark Buttons", showBackground = true, backgroundColor = 0xFF121212)
@Composable
fun EarthButtonsDarkPreview() {
    PokedexTheme(context = PokedexContextDark) {
        Column {
            ButtonComponent(label = "Ground", style = ButtonStyle.Ground, onClick = {})
            ButtonComponent(label = "Rock", style = ButtonStyle.Rock, onClick = {})
            ButtonComponent(label = "Poison", style = ButtonStyle.Poison, onClick = {})
            ButtonComponent(label = "Steel", style = ButtonStyle.Metal, onClick = {})
            ButtonComponent(label = "Fighting", style = ButtonStyle.Fighting, onClick = {})
        }
    }
}

@Preview(name = "Watter Dark Buttons", showBackground = true, backgroundColor = 0xFF121212)
@Composable
fun WaterButtonsDarkPreview() {
    PokedexTheme(context = PokedexContextDark) {
        Column {
            ButtonComponent(label = "Water", style = ButtonStyle.Watter, onClick = {})
            ButtonComponent(label = "Ice", style = ButtonStyle.Ice, onClick = {})
            ButtonComponent(label = "Bug", style = ButtonStyle.Bug, onClick = {})
        }
    }
}

@Preview(name = "Air Dark Buttons", showBackground = true, backgroundColor = 0xFF121212)
@Composable
fun AirButtonsDarkPreview() {
    PokedexTheme(context = PokedexContextDark) {
        Column {
            ButtonComponent(label = "Flying", style = ButtonStyle.Flying, onClick = {})
            ButtonComponent(label = "Dragon", style = ButtonStyle.Dragon, onClick = {})
            ButtonComponent(label = "Fairy", style = ButtonStyle.Fairy, onClick = {})
            ButtonComponent(label = "Psychic", style = ButtonStyle.Psychic, onClick = {})
        }
    }
}


@Composable
fun ButtonComponent(
    label: String,
    modifier: Modifier = Modifier,
    style: ButtonStyle,
    onClick: () -> Unit
) {
    val buttonColors = ButtonDefaults.buttonColors(
        containerColor = style.background,
        contentColor = style.textColor
    )

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxWidth()
    ) {
        Button(
            onClick = onClick,
            shape = RoundedCornerShape(12.dp),
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp),
            colors = buttonColors
        ) {
            Text(
                text = label,
                style = TextStyle(fontSize = style.textSize)
            )
        }
    }
}
