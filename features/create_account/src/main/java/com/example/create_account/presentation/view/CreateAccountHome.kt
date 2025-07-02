package com.example.create_account.presentation.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.create_account.R
import com.example.design_system.components.toolBar.ToolBar
import com.example.design_system.theme.AppTypography
import com.example.design_system.theme.PokedexTheme

@Composable
internal fun CreateAccountHome(navController: NavController) {
    Scaffold(
        topBar = {
            ToolBar(
                title = stringResource(R.string.create_account_tool_bar_title),
                onBackPressed = { navController.popBackStack() }
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .padding(it)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CreateAccountContent(
                    Modifier
                        .weight(2f)
                        .padding(PokedexTheme.padding.medium)
                )
            }
        }
    )
}

@Composable
internal fun CreateAccountContent(modifier: Modifier) {
    Column(modifier = modifier) {
        Image(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .weight(1f)
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
    }
}

@PreviewLightDark()
@Composable
internal fun CreateAccountHomePreview() {
    val navController = rememberNavController()
    PokedexTheme{
        CreateAccountHome(navController = navController)
    }
}