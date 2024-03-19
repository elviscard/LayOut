package com.example.layout.componentes

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
fun CaixaTexto() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(295.dp)
            .background(Color.White) //por fora de tudo
            .border(1.dp, Color(0xFFF5F5F5))
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = 5.dp,
                    top = 8.dp,
                    end = 20.dp,
                    bottom = 8.dp
                )
                .clip(shape = RoundedCornerShape(15.dp))
                .background(Color(0xFFFFFFFF)) //está por trás de tudo
        ) {
            Row(
                modifier = Modifier
//                .fillMaxSize()
                    .width(280.dp)
                    .height(295.dp)
                    .background(Color(0xFFFFFFFF)) //deveria ser branco
                    //.border(BorderStroke(1.dp, Color.Magenta))
            ) {
                Column(
                    modifier = Modifier
                        .padding(
                            top = 13.dp,
                            start = 15.dp,
                            end = 10.dp,
                            bottom = 10.dp
                        )
                ) {
                    Text(
                        text = "1 - Paracetamol - 500 mg",
                        fontFamily = FontFamily.Default,
                        //fontWeight = FontWeight.Bold,
                        fontSize = 12.sp
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        modifier = Modifier.padding(
                            top = 5.dp
                        ),
                        text = "2 - Ibuprofeno - 200 mg",
                        fontFamily = FontFamily.Default,
                        fontSize = 12.sp
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        modifier = Modifier.padding(
                            top = 5.dp
                        ),
                        text = "3 - Omeprazol - 20 mg",
                        fontFamily = FontFamily.Default,
                        fontSize = 12.sp
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        modifier = Modifier.padding(
                            top = 5.dp
                        ),
                        text = "4 - Amoxicilina - 500 mg",
                        fontFamily = FontFamily.Default,
                        fontSize = 12.sp
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        modifier = Modifier.padding(
                            top = 5.dp
                        ),
                        text = "5 - Dipirona - 500 mg",
                        fontFamily = FontFamily.Default,
                        fontSize = 12.sp
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        modifier = Modifier.padding(
                            top = 5.dp
                        ),
                        text = "6 - Metformina - 850 mg",
                        fontFamily = FontFamily.Default,
                        fontSize = 12.sp
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 10.dp)
                    //.background(Color(0xFFFEF7E6))

            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .height(18.dp)
                        .background(Color(0xFFFFFFFF)) //deveria ser branco
                ) {
                    Icon(
                        imageVector = Icons.Default.AddCircle,
                        contentDescription = "Imagem",
                        modifier = Modifier.size(15.dp)
                        //.background(Color.Yellow)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "01"
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Icon(
                        imageVector = Icons.Default.AddCircle,
                        contentDescription = "Imagem",
                        modifier = Modifier.size(15.dp)
                        //.background(Color.Yellow)
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 27.dp)
                        .background(Color(0xFFFEF7E6))
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .height(18.dp)
                            .background(Color(0xFFFFFFFF)) //deveria ser branco
                    ) {
                        Icon(
                            imageVector = Icons.Default.AddCircle,
                            contentDescription = "Imagem",
                            modifier = Modifier.size(15.dp)
                            //.background(Color.Yellow)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "03"
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Icon(
                            imageVector = Icons.Default.AddCircle,
                            contentDescription = "Imagem",
                            modifier = Modifier.size(15.dp)
                            //.background(Color.Yellow)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 27.dp)
                            .background(Color(0xFFFEF7E6))
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .height(18.dp)
                                .background(Color(0xFFFFFFFF)) //deveria ser branco

                        ) {
                            Icon(
                                imageVector = Icons.Default.AddCircle,
                                contentDescription = "Imagem",
                                modifier = Modifier.size(15.dp)
                                //.background(Color.Yellow)
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = "03"
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Icon(
                                imageVector = Icons.Default.AddCircle,
                                contentDescription = "Imagem",
                                modifier = Modifier.size(15.dp)
                                //.background(Color.Yellow)
                            )
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(top = 27.dp)
                                .background(Color(0xFFFEF7E6))
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .height(18.dp)
                                    .background(Color(0xFFFFFFFF)) //deveria ser branco

                            ) {
                                Icon(
                                    imageVector = Icons.Default.AddCircle,
                                    contentDescription = "Imagem",
                                    modifier = Modifier.size(15.dp)
                                    //.background(Color.Yellow)
                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Text(
                                    text = "03"
                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Icon(
                                    imageVector = Icons.Default.AddCircle,
                                    contentDescription = "Imagem",
                                    modifier = Modifier.size(15.dp)
                                    //.background(Color.Yellow)
                                )
                            }
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(top = 27.dp)
                                    .background(Color(0xFFFEF7E6))
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .height(18.dp)
                                        .background(Color(0xFFFFFFFF)) //deveria ser branco


                                ) {
                                    Icon(
                                        imageVector = Icons.Default.AddCircle,
                                        contentDescription = "Imagem",
                                        modifier = Modifier.size(15.dp)
                                        //.background(Color.Yellow)
                                    )
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Text(
                                        text = "03"
                                    )
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Icon(
                                        imageVector = Icons.Default.AddCircle,
                                        contentDescription = "Imagem",
                                        modifier = Modifier.size(15.dp)
                                        //.background(Color.Yellow)
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(top = 27.dp)
                                        .background(Color(0xFFFEF7E6))
                                ) {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .height(18.dp)
                                            .background(Color(0xFFFFFFFF)) //deveria ser branco

                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.AddCircle,
                                            contentDescription = "Imagem",
                                            modifier = Modifier.size(15.dp)
                                            //.background(Color.Yellow)
                                        )
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Text(
                                            text = "03"
                                        )
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Icon(
                                            imageVector = Icons.Default.AddCircle,
                                            contentDescription = "Imagem",
                                            modifier = Modifier.size(15.dp)
                                            //.background(Color.Yellow)
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


@Preview
@Composable
private fun CaixaTextoPreview() {
    CaixaTexto()
}