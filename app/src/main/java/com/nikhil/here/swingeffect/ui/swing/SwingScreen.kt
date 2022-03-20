package com.nikhil.here.swingeffect.ui.swing

import androidx.compose.animation.core.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp

@Composable
fun SwingScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier
        ) {
            Panel()
            Nail()
        }

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Art of Swing", style = MaterialTheme.typography.body1)
    }
}

@Composable
fun Panel() {
    val angleOffset = 10f
    val infiniteTransition = rememberInfiniteTransition()
    val angle by infiniteTransition.animateFloat(
        initialValue = -angleOffset,
        targetValue = angleOffset,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 600,
                easing = FastOutSlowInEasing
            ),
            repeatMode = RepeatMode.Reverse
        )
    )

    Surface(
        modifier = Modifier
            .size(100.dp)
            .graphicsLayer(
                transformOrigin = TransformOrigin(
                    pivotFractionX = 0.5f,
                    pivotFractionY = 0.1f
                ),
                rotationZ = angle
            ),
        color = Color.Red,
        shape = RoundedCornerShape(8.dp)
    ) {

    }
}

@Composable
fun Nail() {
    Surface(
        modifier = Modifier
            .padding(top = 2.dp)
            .size(32.dp),
        color = Color.Red,
        shape = CircleShape,
        border = BorderStroke(width = 8.dp, color = Color.White)
    ) {

    }
}