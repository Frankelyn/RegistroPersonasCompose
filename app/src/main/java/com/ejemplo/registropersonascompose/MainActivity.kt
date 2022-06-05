package com.ejemplo.registropersonascompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ejemplo.registropersonascompose.ui.screens.ListaOcupacionesData
import com.ejemplo.registropersonascompose.ui.screens.ListaPersonasData
import com.ejemplo.registropersonascompose.ui.screens.OcupacionesData
import com.ejemplo.registropersonascompose.ui.screens.PersonasData
import com.ejemplo.registropersonascompose.ui.theme.RegistroPersonasComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           RegistroPersonasComposeTheme() {
               MyApp()
           }
        }
    }


}



 @Composable
 fun MyApp() {
     val navHostController = rememberNavController()

     NavHost(navController = navHostController, startDestination = "ListaDePersonas"){
         composable("ListaDeOcupaciones"){
             ListaOcupacionesData(navHostController = navHostController)
         }
         composable("RegistroOcupaciones"){
             OcupacionesData(navHostController = navHostController)
         }
         composable("ListaDePersonas"){
             ListaPersonasData(navHostController = navHostController)
         }
         composable("RegistroPersona"){
             PersonasData(navHostController = navHostController)
         }
     }
 }

@Preview(showBackground = true)
@Composable
fun defaultPreview(){
    RegistroPersonasComposeTheme {
        //MyApp()
    }
}