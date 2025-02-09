package com.fredymar.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Ejercicio1 (modifier: Modifier){
    Column(modifier = modifier) {
        Box(modifier= Modifier.weight(1f).fillMaxWidth().background(Color.Cyan), contentAlignment = Alignment.Center){
            Text(text = "Ejemplo 1")
        }
        Box(modifier = Modifier.weight(1f).fillMaxWidth()){
            Row {
                Box(modifier = Modifier.weight(1f).height(290.dp).background(Color.Red))
                Box(modifier = Modifier.weight(1f).height(290.dp).background(Color.Green), contentAlignment = Alignment.Center){
                    Text(text = "Ejemplo 3")
                }
            }
        }
        Box(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Magenta))
    }
}