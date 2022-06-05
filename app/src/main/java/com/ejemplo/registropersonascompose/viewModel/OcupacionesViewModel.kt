package com.ejemplo.registropersonascompose.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ejemplo.registropersonascompose.Model.Ocupacion
import com.example.peopleregistercompose.data.repository.OcupacionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OcupacionesViewModel @Inject constructor(
    val ocupacionRepository: OcupacionRepository
): ViewModel() {

    var Descripcion by mutableStateOf("")

    fun Guardar(){
        viewModelScope.launch {
            ocupacionRepository.insertar(
                Ocupacion(
                   descripcion = Descripcion
                )
            )
        }
    }
}