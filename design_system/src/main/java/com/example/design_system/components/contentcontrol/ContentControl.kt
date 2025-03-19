package com.example.design_system.components.contentcontrol

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.design_system.theme.PokedexTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ContentControl(
    pagerState: PagerState,
    pageCount: Int,
    modifier: Modifier = Modifier,
    activeColor: Color = PokedexTheme.normalButton,
    inactiveColor: Color = PokedexTheme.disableButton,
    dotSize: Float = 8f,
    dotSpacing: Float = 12f,
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(dotSpacing.dp),
            modifier = Modifier.height(dotSize.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            repeat(pageCount) {
                Box(
                    modifier = Modifier
                        .size(dotSize.dp)
                        .background(
                            color = inactiveColor,
                            shape = CircleShape
                        )
                )
            }
        }

        Box(
            Modifier
                .drawBehind {
                    val distance = (dotSize + dotSpacing).dp.toPx()
                    val scrollPosition =
                        pagerState.currentPage + pagerState.currentPageOffsetFraction
                    val wormOffset = (scrollPosition % 1) * 2

                    val xPos = scrollPosition.toInt() * distance
                    val head = xPos + distance * 0f.coerceAtLeast(wormOffset - 1)
                    val tail = xPos + dotSize.dp.toPx() + 1f.coerceAtMost(wormOffset) * distance

                    val wormAnimation = RoundRect(
                        head, 0f, tail, dotSize.dp.toPx(),
                        CornerRadius(50f)
                    )

                    val path = Path().apply { addRoundRect(wormAnimation) }
                    drawPath(
                        path = path,
                        color = activeColor
                    )
                }
                .size(dotSize.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewContentControl() {
    val pagerState = rememberPagerState(0) {
        2
    }

    ContentControl(
        pagerState = pagerState,
        pageCount = 2,
        modifier = Modifier.size(100.dp, 20.dp)
    )
}