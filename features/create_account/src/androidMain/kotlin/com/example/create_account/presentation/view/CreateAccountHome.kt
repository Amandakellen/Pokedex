package com.example.create_account.presentation.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.create_account.R
import com.example.design_system.components.button.ButtonComponent
import com.example.design_system.components.button.ButtonStyle
import com.example.design_system.components.toolBar.ToolBar
import com.example.design_system.theme.AppTypography
import com.example.design_system.theme.PokedexTheme

private const val MIN_WIDTH = 0.7f
private const val MAX_WIDTH = 0.90f
private const val MIN_HEIGHT = 0.1f
@Composable
internal fun CreateAccountHome(navController: NavController) {
    PokedexTheme {
        Scaffold(
            topBar = {
                ToolBar(
                    title = stringResource(R.string.create_account_tool_bar_title),
                    onBackPressed = { navController.popBackStack() }
                )
            },
            content = {

                CreateAccountContent(
                    Modifier
                        .padding(it)
                )

            }
        )
    }
}

@Composable
internal fun CreateAccountContent(modifier: Modifier) {

    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .weight(0.5f)
                .fillMaxWidth(),
            painter = painterResource(id = R.drawable.ic_girl),
            contentDescription = null
        )

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(PokedexTheme.padding.small),
            text = stringResource(R.string.create_account_home_title),
            style = AppTypography.headlineMedium,
            textAlign = TextAlign.Center,
            color = PokedexTheme.text
        )

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(PokedexTheme.padding.small),
            text = stringResource(R.string.create_account_home_subtitle),
            style = AppTypography.bodyLarge,
            textAlign = TextAlign.Center,
            color = PokedexTheme.text
        )

        ButtonComponent(
            modifier = Modifier
                .fillMaxWidth()
                .padding(PokedexTheme.padding.small),
            label = "Continuar com o google",
            style = ButtonStyle.Secondary,
            onClick = {},
            leftIcon = com.example.design_system.R.drawable.ic_pokedex_name,
            border = BorderStroke(PokedexTheme.width.tiny, PokedexTheme.strokeColor)
        )
        ButtonComponent(
            modifier = Modifier
                .fillMaxWidth()
                .padding(PokedexTheme.padding.small),
            label = "Continuar com o google",
            style = ButtonStyle.Secondary,
            onClick = {},
            border = BorderStroke(PokedexTheme.width.tiny, PokedexTheme.strokeColor),
            leftIcon = com.example.design_system.R.drawable.ic_pokedex_name
        )

        ButtonComponent(
            modifier = Modifier
                .fillMaxWidth()
                .padding(PokedexTheme.padding.small),
            label = "Continuar com o email",
            style = ButtonStyle.Primary,
            onClick = {}
        )
    }
}


@PreviewLightDark()
@Composable
internal fun CreateAccountHomePreview() {
    val navController = rememberNavController()
    PokedexTheme {
        CreateAccountHome(navController = navController)
    }
}