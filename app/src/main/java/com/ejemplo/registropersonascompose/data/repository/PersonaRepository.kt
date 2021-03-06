package com.example.peopleregistercompose.data.repository

import com.ejemplo.registropersonascompose.Model.Persona
import com.ejemplo.registropersonascompose.data.PersonaDao

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PersonaRepository @Inject constructor(
    val personaDao: PersonaDao
) {

    suspend fun insertar(persona: Persona){
        personaDao.insertar(persona)
    }


    suspend fun eliminar(persona : Persona){
        personaDao.eliminar(persona)
    }


    fun buscar(personaId: Int): Flow<Persona> {
        return   personaDao.buscar(personaId)
    }

    fun getList(): Flow<List<Persona>> {
        return  personaDao.getList()
    }
}