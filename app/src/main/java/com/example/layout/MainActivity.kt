package com.example.layout


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.layout.componentes.CaixaTexto
import com.example.layout.componentes.escreve
import com.example.layout.ui.theme.LayOutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LayOutTheme {
                Greeting()

            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        modifier = Modifier.background(Color.White)
    ) {
        CaixaTexto()
        escreve(name = "Android", modifier = Modifier)
    }
}


//@Composable
//fun Greeting() {
//    Column(
//        modifier = Modifier.background(Color.White)
//    ) {
//        escreve(name = "", modifier = Modifier)
//    }
//}


@Preview
@Composable
fun GreetingPreview() {
    LayOutTheme {
        Greeting()
    }
}
