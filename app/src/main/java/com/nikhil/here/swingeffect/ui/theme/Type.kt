package com.nikhil.here.swingeffect.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.nikhil.here.swingeffect.R


val maliFontFamily = FontFamily(
    Font(R.font.mali),
    Font(R.font.mali_light, FontWeight.Light),
    Font(R.font.mali_medium, FontWeight.Medium),
    Font(R.font.mali_bold, weight = FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = maliFontFamily,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        fontFamily = maliFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    )
)