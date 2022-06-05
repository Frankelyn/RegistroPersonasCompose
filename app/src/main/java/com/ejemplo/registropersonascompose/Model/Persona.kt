package com.ejemplo.registropersonascompose.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Personas")
data class Persona (
    @PrimaryKey(autoGenerate = true)
    val PersonaId: Int = 0,
    val nombres: String,
    val email: String,
    val ocupacionId: Int = 0,
    val salario: Double

)


