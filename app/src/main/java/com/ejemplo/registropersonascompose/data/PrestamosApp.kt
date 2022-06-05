package com.ejemplo.registropersonascompose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ejemplo.registropersonascompose.Model.Ocupacion
import com.ejemplo.registropersonascompose.Model.Persona

@Database(
    entities = [
        Ocupacion::class,
        Persona::class
    ],
    exportSchema = false,
    version = 1
)
abstract class PrestamosDb : RoomDatabase() {
    abstract val ocupacionDao: OcupacionDao
    abstract val personaDao: PersonaDao
}
