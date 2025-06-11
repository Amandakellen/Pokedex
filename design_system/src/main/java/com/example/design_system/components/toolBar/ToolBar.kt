package com.example.design_system.components.toolBar

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.example.design_system.R
import com.example.design_system.theme.AppTypography
import com.example.design_system.theme.PokedexTheme

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
                    painter = painterResource(id = R.drawable.arrow_black),
                    contentDescription = "Back",
                    tint = androidx.compose.material3.MaterialTheme.colorScheme.onSurface,
                )
            }

            Text(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth(),
                text = title,
                style = AppTypography.headlineSmall,
                textAlign = TextAlign.Center,
                color = PokedexTheme.text
            )
        }
    }
}

@PreviewLightDark
@Composable
fun ToolBarPreview() {
    PokedexTheme {
       ToolBar(onBackPressed = {}, title = "Criar conta ")
    }

}