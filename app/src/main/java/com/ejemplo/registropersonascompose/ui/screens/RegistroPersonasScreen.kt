package com.ejemplo.registropersonascompose.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

var selectedOcupacion: String? = null

@Composable
 fun PersonasData(navHostController: NavHostController){
    var txNombres by remember { mutableStateOf("") }
    var txEmail by remember { mutableStateOf("") }
    var txSalario by remember { mutableStateOf("") }
    val txOcupacion = listOf("Estudiante", "Ingeniero")
    Scaffold(
        topBar = {
            TopAppBar(
                title = {Text("Registro Personas")}
            )
        }
    ) {
        MaterialTheme(){

            Column(
               modifier = Modifier
                   .padding(it)
                   .padding(16.dp)
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
                
                OcupacionesSpinner(ocupacion = txOcupacion)

                TextField(
                    placeholder = {Text("Salario")},
                    value = txSalario,
                    onValueChange ={txSalario = it},
                    modifier = Modifier.padding(8.dp) )



                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                    onClick = {
                        navHostController.navigateUp()
                    }) {
                    Text(text = "Guardar")
                }





            }



        }
    }
}

@Composable
fun OcupacionesSpinner(ocupacion:List<String>){

    var ocupacionText by remember{
        mutableStateOf("")
    }
    var expended by remember{
        mutableStateOf(false)
    }
    Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        Row(Modifier
            .fillMaxWidth()
            .clickable {
                expended = !expended
            }
            .padding(8.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){

            Text(text = ocupacionText, fontSize = 18.sp, modifier = Modifier.padding(end = 8.dp))
            Icon(imageVector = Icons.Filled.ArrowDropDown, contentDescription = "")
            DropdownMenu(expanded = expended, onDismissRequest = { expended = false}) {
                ocupacion.forEach {
                        ocupacion -> DropdownMenuItem(onClick = {

                    expended = false
                    ocupacionText = ocupacion.toString()
                    selectedOcupacion = ocupacion
                }) {
                    Text(text = ocupacion.toString())
                }
                }

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PersonasDataPreview(){
    //PersonasData(navHostController = NavHostController())
}