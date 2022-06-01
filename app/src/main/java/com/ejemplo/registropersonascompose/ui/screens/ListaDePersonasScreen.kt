package com.ejemplo.registropersonascompose.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun RowItems(nombre: String) {
    Row() {
        Text(nombre)
    }
}

@Composable
fun ListaPersonasData(name: String){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Lista de Personas") }
            )
        }
    ) {
        MaterialTheme(){

            Column(
                modifier = Modifier.padding(16.dp)
            ) {

                val listaNombres = listOf<String>("Frankelyn", "Nicole", "Emilio", "Ricardo")

                LazyColumn(modifier = Modifier.fillMaxWidth()) {
                    items(listaNombres) { nombre ->
                        RowItems(nombre = nombre)
                    }
                }

                Scaffold(
                    floatingActionButton = {
                        FloatingActionButton(
                            onClick = { }
                        ) {
                            Icon(imageVector = Icons.Default.Add, contentDescription = null)
                        }
                    },
                    floatingActionButtonPosition = FabPosition.End
                ) {

                }



            }



        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListaPersonasDataPreview(){
    ListaPersonasData(name = "Frankelyn")
}