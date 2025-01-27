package com.fredymar.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun MyColumn(){
    Column {
        Text("Hola 1", modifier = Modifier.background(Color.Magenta))
        Text("Hola 2", modifier = Modifier.background(Color.Red))
        Text("Hola 3", modifier = Modifier.background(Color.Blue))
        Text("Hola 4", modifier = Modifier.background(Color.Cyan))
    }
}