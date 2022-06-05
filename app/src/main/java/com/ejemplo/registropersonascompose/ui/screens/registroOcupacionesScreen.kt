package com.ejemplo.registropersonascompose.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.ejemplo.registropersonascompose.viewModel.OcupacionesViewModel

@Composable
fun OcupacionesData(navHostController: NavHostController,
                    viewModel: OcupacionesViewModel = hiltViewModel())
{
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
                modifier = Modifier
                    .padding(it)
                    .padding(16.dp)
            ) {

                TextField(
                    placeholder = { Text("Ocupacion") },
                    value = txOcupacion,
                    onValueChange ={txOcupacion = it},
                    modifier = Modifier.padding(8.dp) )




                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                    onClick = {
                        viewModel.Guardar()
                        navHostController.navigateUp()
                    }) {
                    Text(text = "Guardar")
                }





            }



        }
    }
}




@Preview(showBackground = true)
@Composable
fun OcupacionDataPreview(){
    //OcupacionesData(navHostController = NavHostController())

}