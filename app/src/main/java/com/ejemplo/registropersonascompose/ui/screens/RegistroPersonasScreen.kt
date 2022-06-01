package com.ejemplo.registropersonascompose.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
private fun PersonasData(name: String){
    MaterialTheme(){
        Column(
           modifier = Modifier.padding(16.dp)
        ) {

            

        }

                

    }
}

@Preview(showBackground = true)
@Composable
fun PersonasDataPreview(){
    PersonasData(name = "Frankelyn")
}