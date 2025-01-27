package com.fredymar.myfirstcomposeapp.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! Compañeros",
        modifier = modifier
    )
}

@Preview()

@Composable
fun ExamplePreview(){
    Example("Anna")
}

@Composable
fun Example(a:String){
    Text("Fredymar y $a", modifier = Modifier
        .padding(70.dp)
        .background(Color.Magenta)
    )
}