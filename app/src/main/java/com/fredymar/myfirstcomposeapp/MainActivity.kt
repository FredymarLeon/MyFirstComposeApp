package com.fredymar.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.fredymar.myfirstcomposeapp.components.layout.ConstraintExampleGuide
import com.fredymar.myfirstcomposeapp.components.layout.ConstraintLayoutEjercicio2
import com.fredymar.myfirstcomposeapp.components.layout.Ejercicio1
import com.fredymar.myfirstcomposeapp.components.layout.MyBasicConstraintLayout
import com.fredymar.myfirstcomposeapp.components.layout.MyComplexLayout
import com.fredymar.myfirstcomposeapp.components.layout.MyRow
import com.fredymar.myfirstcomposeapp.login.Greeting
import com.fredymar.myfirstcomposeapp.state.MyState
import com.fredymar.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstComposeAppTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    MyState(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstComposeAppTheme {
        Greeting("Android")
    }
}