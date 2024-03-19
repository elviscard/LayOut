package com.example.layout.componentes

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun enviar(modifier: Modifier = Modifier) {
    Button(
        onClick = { /*TODO*/ },
        modifier = modifier
            .width(140.dp)
            .height(40.dp),
        colors = ButtonDefaults.buttonColors(Color(0xFF4EB003)),
        ) {
        Text(
            text = "Enviar Pedido!",
            color = Color.White,
            fontSize = 10.sp,
            modifier = Modifier.padding(
                top = 1.dp
            )
        )
    }
}




@Preview
@Composable
private fun enviarPreview() {
    enviar()
}