package com.example.design_system.components.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.design_system.R
import com.example.design_system.theme.PokedexTheme

private const val MIN_WIDTH = 0.7f
private const val MAX_WIDTH = 0.90f
private const val MIN_HEIGHT = 0.1f

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
    iconSize: Dp = PokedexTheme.size.superLarge,
    border: BorderStroke? = null
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
        colors = buttonColors,
        border = border
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

@Composable
fun Modifier.buttonSize(): Modifier {
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp
    val buttonHeight = screenHeight * MIN_HEIGHT
    return this
        .height(buttonHeight)
        .wrapContentWidth()
        .widthIn(
            min = configuration.screenWidthDp.dp * MIN_WIDTH,
            max = configuration.screenWidthDp.dp * MAX_WIDTH
        )
        .padding(
            vertical = PokedexTheme.padding.medium,
            horizontal = PokedexTheme.padding.superSmall
        )
}
