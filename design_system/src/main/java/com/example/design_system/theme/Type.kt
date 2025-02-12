package com.example.design_system.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import com.example.design_system.R

val poppinFont = GoogleFont("Poppins")
val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val poppinsFontFamily = FontFamily(
    Font(googleFont = poppinFont, fontProvider = provider, weight = FontWeight.Bold)
)

val AppTypography = Typography(
    bodyLarge = TextStyle(
        fontFamily = poppinsFontFamily
    )
)
