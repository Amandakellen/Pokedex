package com.example.design_system.data

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Size(
    val superSmall: Dp = 4.dp,
    val small: Dp = 8.dp,
    val medium: Dp = 16.dp,
    val large: Dp = 24.dp,
    val extraLarge: Dp = 32.dp,
    val superLarge: Dp = 40.dp,
    val megaLarge: Dp = 56.dp
)