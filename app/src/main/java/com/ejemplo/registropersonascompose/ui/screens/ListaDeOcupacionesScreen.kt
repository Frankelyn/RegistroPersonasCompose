package com.ejemplo.registropersonascompose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ListaOcupacionesData(name: String){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Lista de Ocupaciones") }
            )
        }
    ) {
        MaterialTheme(){

            Column(
                modifier = Modifier.padding(16.dp)
            ) {

                val listaNombres = listOf<String>("Ing En Sistemas", "Estudiante")

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
fun ListaOcupacionesDataPreview(){
    ListaOcupacionesData(name = "Frankelyn")
}