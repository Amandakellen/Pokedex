package com.example.design_system.components.toolBar

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import androidx.compose.ui.text.style.TextAlign
import com.example.design_system.theme.AppTypography
import com.example.design_system.theme.PokedexTheme
import org.jetbrains.compose.ui.tooling.preview.Preview
import pokedex.design_system.generated.resources.Res
import pokedex.design_system.generated.resources.arrow_black

@Composable
fun ToolBar(modifier: Modifier =  Modifier, title: String, onBackPressed:()-> Unit) {
    Box(
        modifier = modifier.background(PokedexTheme.background),
    ){
        Row(modifier = Modifier) {
            Box(
                modifier = Modifier
                    .padding(PokedexTheme.padding.medium)
                    .clickable(onClick = onBackPressed)
            ) {
                Icon(
                    painter = painterResource(Res.drawable.arrow_black),
                    contentDescription = "Back",
                    tint = MaterialTheme.colorScheme.onSurface,
                )
            }

            Text(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth(),
                text = title,
                style = AppTypography().headlineSmall,
                textAlign = TextAlign.Center,
                color = PokedexTheme.text
            )
        }
    }
}

@Preview
@Composable
fun ToolBarPreview() {
    PokedexTheme {
       ToolBar(onBackPressed = {}, title = "Criar conta ")
    }

}