package com.fredymar.myfirstcomposeapp.login

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! Compañeros",
        modifier = modifier
    )
}

@Preview(
    widthDp = 70,
    heightDp = 50,
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_4
)

@Composable
fun ExamplePreview(){
    Example("Anna")
}

@Composable
fun Example(a:String){
    Text("Fredymar $a")
}