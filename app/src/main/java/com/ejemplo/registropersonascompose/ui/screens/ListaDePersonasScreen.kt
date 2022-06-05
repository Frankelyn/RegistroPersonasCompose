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
import androidx.navigation.NavHostController


@Composable
fun RowItems(nombre: String) {
    Row() {
        Text(nombre)
    }
}

@Composable
fun ListaPersonasData(navHostController: NavHostController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Lista de Personas")}
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                navHostController.navigate("RegistroPersona")
            }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        }

    ) {
        Column(modifier = Modifier.padding(it).padding(16.dp)) {
            Button(onClick = {
                navHostController.navigate("ListaDeOcupaciones")
            }) {
                Text(text = "Nueva Ocupación")
            }
            val lista = listOf("Frankelyn", "Alvaro", "Prandi", "Nicole")

            LazyColumn(modifier = Modifier.fillMaxWidth()){
                items(lista){
                        nombre -> RowItems(nombre = nombre)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListaPersonasDataPreview(){
    //ListaPersonasData(navHostController = NavHostController())
}