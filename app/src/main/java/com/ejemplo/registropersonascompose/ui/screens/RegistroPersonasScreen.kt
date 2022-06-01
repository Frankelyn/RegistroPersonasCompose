package com.ejemplo.registropersonascompose.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
 fun PersonasData(name: String){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {Text("Registro Personas")}
            )
        }
    ) {
        MaterialTheme(){
            var txNombres by remember { mutableStateOf("") }
            var txEmail by remember { mutableStateOf("") }
            var txSalario by remember { mutableStateOf("") }
            var txOcupacion by remember { mutableStateOf("") }
            Column(
               modifier = Modifier.padding(16.dp)
            ) {

                TextField(
                    placeholder = {Text("Nombres")},
                    value = txNombres,
                    onValueChange ={txNombres = it},
                    modifier = Modifier.padding(8.dp) )

                TextField(
                    placeholder = {Text("Email")},
                    value = txEmail,
                    onValueChange ={txEmail = it},
                    modifier = Modifier.padding(8.dp) )

                TextField(
                    placeholder = {Text("Salario")},
                    value = txSalario,
                    onValueChange ={txSalario = it},
                    modifier = Modifier.padding(8.dp) )



                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                    onClick = { /*TODO*/ }) {
                    Text(text = "Guardar")
                }





            }



        }
    }
}

@Preview(showBackground = true)
@Composable
fun PersonasDataPreview(){
    PersonasData(name = "Frankelyn")
}