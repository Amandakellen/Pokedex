package com.example.design_system.components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.Dp
import com.example.design_system.R
import com.example.design_system.theme.PokedexTheme

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
                onClick = {},
                leftIcon = R.drawable.ic_pokedex_name
            )
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
    iconSize: Dp = PokedexTheme.size.superLarge
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
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = if (leftIcon != null) {
                Arrangement.SpaceBetween
            } else {
                Arrangement.Center
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            leftIcon?.let {
                Icon(
                    modifier = Modifier
                        .padding(start = PokedexTheme.padding.medium)
                        .align(Alignment.CenterVertically)
                        .size(iconSize),
                    painter = painterResource(id = it),
                    contentDescription = null,
                )
            }
            Text(
                modifier = Modifier
                    .padding(horizontal = PokedexTheme.padding.medium)
                    .weight(0.5f)
                    .align(Alignment.CenterVertically),
                textAlign = TextAlign.Center,
                text = label,
                style = TextStyle(fontSize = style.textSize),
                fontWeight = style.fontWeight,
            )
        }
    }

}
