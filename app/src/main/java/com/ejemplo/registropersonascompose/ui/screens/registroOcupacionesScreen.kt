package com.ejemplo.registropersonascompose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun OcupacionesData(name: String){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Registro de Ocupaciones") }
            )
        }
    ) {
        MaterialTheme(){
            var txOcupacion by remember { mutableStateOf("") }

            Column(
                modifier = Modifier.padding(16.dp)
            ) {

                TextField(
                    placeholder = { Text("Ocupacion") },
                    value = txOcupacion,
                    onValueChange ={txOcupacion = it},
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
fun OcupacionDataPreview(){
    OcupacionesData(name ="Ocupaciones")

}