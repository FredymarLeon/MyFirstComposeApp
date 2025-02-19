package com.fredymar.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyBasicConstraintLayout(modifier: Modifier){
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxMagenta, boxRed, boxBlue, boxCyan, boxYellow) = createRefs()

        Box(Modifier.size(146.dp).background(Color.Magenta).constrainAs(boxMagenta){
            bottom.linkTo(boxYellow.top)
            end.linkTo(boxYellow.start)
        })
        Box(Modifier.size(146.dp).background(Color.Red).constrainAs(boxRed){
            bottom.linkTo(boxYellow.top)
            start.linkTo(boxYellow.end)
        })
        Box(Modifier.size(146.dp).background(Color.Blue).constrainAs(boxBlue){
            top.linkTo(boxYellow.bottom)
            end.linkTo(boxYellow.start)
        })
        Box(Modifier.size(146.dp).background(Color.Cyan).constrainAs(boxCyan){
            top.linkTo(boxYellow.bottom)
            start.linkTo(boxYellow.end)
        })
        Box(Modifier.size(146.dp).background(Color.Yellow).constrainAs(boxYellow){
            bottom.linkTo(parent.bottom)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            start.linkTo(parent.start)
        })
    }
}

@Composable
fun ConstraintExampleGuide(modifier: Modifier){
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val boxRed = createRef()
        
    }
}