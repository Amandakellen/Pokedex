package com.example.onboarding.presentation.view.informative

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.text.style.TextAlign
import com.example.design_system.components.contentcontrol.ContentControl
import com.example.design_system.theme.AppTypography
import com.example.features.onboarding.R

@Composable
fun OnboardingInformativeScreen() {
    val images = listOf(R.drawable.ic_professor_and_trainer)

    val pagerState = rememberPagerState(0) { images.size }

    LaunchedEffect(pagerState) {
        snapshotFlow { pagerState.currentPage }.collect { currentPage ->
//            sendAction(NavigateStep(step = currentPage, shouldLog = false))
        }
    }
    Scaffold(
        content = {
            Column(
                modifier = Modifier
                    .padding(it),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                HorizontalPager(
                    modifier = Modifier.weight(.1f),
                    state = pagerState
                ) { page ->
                    OnboardingInformativeStepScreen(images[page])
                }

                ContentControl(
                    pagerState = pagerState,
                    pageCount = images.size,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(16.dp)
                )
            }
        }
    )

}

@Composable
fun OnboardingInformativeStepScreen(@DrawableRes imageRes: Int) {
    Column {
        Spacer(modifier = Modifier.height(40.dp))
        Image(
            modifier = Modifier
                .padding(40.dp)
                .fillMaxWidth(),
            painter = painterResource(id = imageRes),
            contentDescription = null
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp),
            text = stringResource(R.string.informative_fisrt_title),
            style = AppTypography.headlineMedium,
            textAlign = TextAlign.Center
        )

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp),
            text = "Acesse uma vasta lista de Pokémon de todas as gerações já feitas pela Nintendo",
            style = AppTypography.bodyLarge,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview(showBackground = true)
@Composable
fun OnboardingInformativeScreenPreview() {
    OnboardingInformativeScreen()
}
