package com.ondev.splashscreencompose

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    val scale = remember {
        Animatable(0f)
    }
    LaunchedEffect(true) {
        scale.animateTo(
            targetValue = 0.3f,
            animationSpec = tween(
                durationMillis = 500,
                easing = {
                    OvershootInterpolator(2f).getInterpolation(it)
                }
            )

        )
        delay(3000L)
        navController.navigate("main_screen")
    }


    Box(
        modifier = Modifier.fillMaxSize(),
    )
    {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(com.ondev.splashscreencompose.R.drawable.jcompose_icon),
                contentDescription = "Trinidad Logo",
                modifier = Modifier.scale(scale = scale.value).align(Alignment.CenterHorizontally),
            )
            Spacer(modifier = Modifier.padding(4.dp))
            LinearProgressIndicator(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .width(120.dp)
                    .height(1.dp)
                    .alpha(0.4f),
                color = Color.Gray,
                backgroundColor =Color.Black
            )
        }
    }
}