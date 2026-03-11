package com.example.design_system.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.Font
import pokedex.design_system.generated.resources.Poppins_Bold
import pokedex.design_system.generated.resources.Poppins_Regular
import pokedex.design_system.generated.resources.Res

@Composable
fun PoppinsFontFamily(): FontFamily = FontFamily(
    Font(
        resource = Res.font.Poppins_Regular,
        weight = FontWeight.Normal
    ),
    Font(
        resource = Res.font.Poppins_Bold,
        weight = FontWeight.Bold
    )
)

@Composable
fun AppTypography(): Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = PoppinsFontFamily(),
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = PoppinsFontFamily(),
        fontWeight = FontWeight.Bold,
        fontSize = 26.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = PoppinsFontFamily(),
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    )
)