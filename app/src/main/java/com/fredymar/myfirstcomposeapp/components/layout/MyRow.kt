package com.fredymar.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MyRow(modifier: Modifier) {
    Row(modifier = modifier
        .fillMaxSize()
        .horizontalScroll(rememberScrollState())){
        Text(text = "Hola 1", modifier.background(Color.Red))
        Text(text = "Hola 2", modifier.background(Color.Cyan))
        Text(text = "Hola 3", modifier.background(Color.Blue))
        Text(text = "Hola 4", modifier.background(Color.Magenta))
        Text(text = "Hola 1", modifier.background(Color.Red))
        Text(text = "Hola 2", modifier.background(Color.Cyan))
        Text(text = "Hola 3", modifier.background(Color.Blue))
        Text(text = "Hola 4", modifier.background(Color.Magenta))
        Text(text = "Hola 1", modifier.background(Color.Red))
        Text(text = "Hola 2", modifier.background(Color.Cyan))
        Text(text = "Hola 3", modifier.background(Color.Blue))
        Text(text = "Hola 4", modifier.background(Color.Magenta))
        Text(text = "Hola 1", modifier.background(Color.Red))
        Text(text = "Hola 2", modifier.background(Color.Cyan))
        Text(text = "Hola 3", modifier.background(Color.Blue))
        Text(text = "Hola 4", modifier.background(Color.Magenta))
    }
}

