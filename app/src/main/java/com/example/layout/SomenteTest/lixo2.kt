package com.example.layout.SomenteTest

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ONomeDoRemedio() {

    // Variável de estado para armazenar o texto digitado pelo usuário
    var textFieldValue by remember { mutableStateOf("") }
    var names by remember { mutableStateOf(listOf<String>()) }

    // Definições de estilo de texto subtitle1 e body1
    val subtitle1 = TextStyle(fontSize = 18.sp,)
    val body1 = TextStyle(fontSize = 16.sp,)



    Column(modifier = Modifier.fillMaxSize().padding(16.dp).background(Color(0xFFF5F5F5))) {
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp).align(Alignment.CenterHorizontally).border(width = 1.dp, color = Color.Black)) {
                OutlinedTextField(value = textFieldValue, onValueChange = { textFieldValue = it },
                    label = { Text("Digite o nome do remédio") }
                )
            }
        }

        Button(
            onClick = {names = names + textFieldValue
                textFieldValue = "" },
            modifier = Modifier.padding(top = 16.dp)) { Text(text = "Enviar")}
        // Exibe cada nome em um Card separado
        names.forEach { name -> Card(modifier = Modifier.fillMaxWidth().padding(top = 16.dp)) {
            Column(modifier = Modifier.padding(16.dp)) {
                    Text( text = "Nome:", style = subtitle1, color = Color.Black)
                    Text(text = name, style = body1, color = Color.Black)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
public fun ONomeDoRemedioPreview() {
    ONomeDoRemedio()
}