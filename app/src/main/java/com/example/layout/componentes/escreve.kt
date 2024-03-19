package com.example.layout.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layout.ui.theme.LayOutTheme


@Composable
fun escreve(name: String, modifier: Modifier = Modifier) {
    var textFieldValue by remember { mutableStateOf("") }
    var names by remember { mutableStateOf(listOf<String>()) }
    val subtitle1 = TextStyle(fontSize = 18.sp)
    val body1 = TextStyle(fontSize = 16.sp)

    LayOutTheme {
        val typography = Typography(
            headlineLarge = subtitle1,
            bodyLarge = body1
        )

        MaterialTheme(typography = typography) {
            Column(
                modifier = modifier.padding(16.dp)
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()

                ) {
                    Row(
                        modifier = Modifier
                            .padding(1.dp)
                            .background(Color(0xFFFFFFFF)) //deveria ser branco

                    ) {
                        OutlinedTextField(
                            modifier = Modifier.padding(
                                start = 12.dp,
                                top = 10.dp,
                                bottom = 20.dp,
                                end = 1.dp,
                            ),

                            value = textFieldValue,
                            onValueChange = {
                                textFieldValue = it
                            },

                            label = { Text("Acrescente um produto aí!") }

                        )

                        Row(
                            modifier = Modifier
                                .padding(
                                    start = 10.dp,
                                    top = 20.dp,
                                    bottom = 20.dp,
                                    end = 5.dp,
                                )
                                //.background(Color.Cyan)
                        ) {
                            Icon(
                                imageVector = Icons.Default.AddCircle,
                                contentDescription = "Imagem",
                                modifier = Modifier.size(50.dp)
                                    //.background(Color.Yellow)
                                    .clickable {
                                        names = names + textFieldValue
                                        textFieldValue = ""
                                    }
                            )
                        }
                    }

                    // Exibe cada nome em um Card separado
                    names.forEach { name ->
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 16.dp)
                        ) {
                            Column(
                                modifier = Modifier.padding(16.dp)
                            ) {
                                Text(
                                    text = "",
                                    style = MaterialTheme.typography.headlineLarge // Utiliza o estilo subtitle1 do MaterialTheme
                                )
                                Text(
                                    text = name,
                                    style = MaterialTheme.typography.bodyLarge // Utiliza o estilo body1 do MaterialTheme
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun escrevePreview() {
    escreve("")
}

