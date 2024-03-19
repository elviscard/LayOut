package com.example.layout.SomenteTest

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Vemdolixo5() {

    // Variável de estado para armazenar o texto digitado pelo usuário
//    var textFieldValue by remember { mutableStateOf("") }
//    var names by remember { mutableStateOf(listOf<String>()) }

    // Definições de estilo de texto subtitle1 e body1
//    val subtitle1 = TextStyle(fontSize = 18.sp,)
//    val body1 = TextStyle(fontSize = 16.sp,)


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxHeight()
                .size(
                    width = 330.dp,
                    height = 100.dp
                )
                .padding(
                    start = 10.dp,
                    end = 10.dp,
                    top = 10.dp,
                    bottom = 10.dp
                )
                //.clip(shape = RoundedCornerShape(15.dp))
                .background(Color.White)
                .border(border = BorderStroke(color = Color.Gray, width = 1.dp))
        ) {
            Text(
                modifier = Modifier
                    .padding(
                        start = 15.dp,
                        end = 10.dp,
                        top = 18.dp,
                        bottom = 10.dp
                    ),
                text = "Acrescente um produto",
                fontFamily = FontFamily.Default,
                fontSize = 12.sp
            )
        }
        Row(
            modifier = Modifier
                .fillMaxHeight()
                .padding(
                    start = 0.dp,
                    end = 10.dp,
                    top = 10.dp,
                    bottom = 10.dp
                )
                .clip(shape = RoundedCornerShape(15.dp))
                .background(Color.White)
        ) {

            Icon(

                modifier = Modifier
                    .padding(
                        start = 10.dp,
                        end = 10.dp,
                        top = 13.dp,
                        bottom = 10.dp
                    ),
                imageVector = Icons.Filled.AddCircle, contentDescription = "Insert"
            )
        }
    }
}



@Preview
@Composable
fun Vemdolixo5Preview() {
    Vemdolixo5()
}






//    Column(modifier = Modifier.fillMaxSize().padding(16.dp).background(Color(0xFFF5F5F5))) {
//        Card(modifier = Modifier.fillMaxWidth()) {
//            Column(modifier = Modifier.padding(16.dp).align(Alignment.CenterHorizontally).border(width = 1.dp, color = Color.Black)) {
//                OutlinedTextField(value = textFieldValue, onValueChange = { textFieldValue = it },
//                    label = { Text("Digite o nome do remédio") }
//                )
//            }
//        }
//
//        Button(
//            onClick = {names = names + textFieldValue
//                textFieldValue = "" },
//            modifier = Modifier.padding(top = 16.dp)) { Text(text = "Enviar")}
//        // Exibe cada nome em um Card separado
//        names.forEach { name -> Card(modifier = Modifier.fillMaxWidth().padding(top = 16.dp)) {
//            Column(modifier = Modifier.padding(16.dp)) {
//                Text( text = "Nome:", style = subtitle1, color = Color.Black)
//                Text(text = name, style = body1, color = Color.Black)
//            }
//        }
//        }
//    }
//}

