package com.fredymar.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import kotlinx.coroutines.yield

@Composable
fun ConstraintLayoutEjercicio2(modifier: Modifier){
     ConstraintLayout(modifier = modifier.fillMaxSize()) {
         val (boxCyan, boxBlack, boxGray, boxMagenta, boxGreen, boxYellow, boxLighGray, boxRed, boxBlue) = createRefs()

         Box(Modifier.size(175.dp).background(Color.Cyan).constrainAs(boxCyan){
             bottom.linkTo(boxMagenta.top)
             end.linkTo(boxMagenta.end)
         }, contentAlignment = Alignment.Center){ Text(text = "7") }
         Box(Modifier.size(75.dp).background(Color.Black).constrainAs(boxBlack){
             end.linkTo(parent.end)
             start.linkTo(parent.start)
             bottom.linkTo(boxYellow.top)
             top.linkTo(parent.top)
         }, contentAlignment = Alignment.Center){ Text(text = "9") }
         Box(Modifier.size(175.dp).background(Color.Gray).constrainAs(boxGray){
             bottom.linkTo(boxGreen.top)
             start.linkTo(boxGreen.start)
         }, contentAlignment = Alignment.Center){ Text(text = "8") }
         Box(Modifier.size(75.dp).background(Color.Magenta).constrainAs(boxMagenta){
             bottom.linkTo(boxYellow.top)
             end.linkTo(boxYellow.start)
         }, contentAlignment = Alignment.Center){
             Text(text = "2")
         }
         Box(Modifier.size(75.dp).background(Color.Green).constrainAs(boxGreen){
             bottom.linkTo(boxYellow.top)
             start.linkTo(boxYellow.end)
         }, contentAlignment = Alignment.Center){
             Text(text = "3")
         }
         Box(Modifier.size(75.dp).background(Color.Yellow).constrainAs(boxYellow){
             bottom.linkTo(parent.bottom)
             top.linkTo(parent.top)
             end.linkTo(parent.end)
             start.linkTo(parent.start)
         }, contentAlignment = Alignment.Center){
             Text(text = "1")
         }
         Box(Modifier.size(175.dp).background(Color.Blue).constrainAs(boxBlue){
             end.linkTo(parent.end)
             start.linkTo(parent.start)
             top.linkTo(boxYellow.bottom)

         }, contentAlignment = Alignment.Center){ Text(text = "4") }
         Box(Modifier.size(75.dp).background(Color.LightGray).constrainAs(boxLighGray){
             top.linkTo(boxYellow.bottom)
             end.linkTo(boxYellow.start)
         }, contentAlignment = Alignment.Center){ Text(text = "6") }
         Box(Modifier.size(75.dp).background(Color.Red).constrainAs(boxRed){
             top.linkTo(boxYellow.bottom)
             start.linkTo(boxYellow.end)
         }, contentAlignment = Alignment.Center){ Text(text = "5") }
     }
}