package com.ondev.splashscreencompose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    )
    {
        Text(text = "I LOVE COMPOSE", textAlign = TextAlign.Center)
    }
}