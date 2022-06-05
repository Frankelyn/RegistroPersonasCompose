package com.ejemplo.registropersonascompose.di

import android.content.Context
import androidx.room.Room
import com.ejemplo.registropersonascompose.data.OcupacionDao
import com.ejemplo.registropersonascompose.data.PersonaDao
import com.ejemplo.registropersonascompose.data.PrestamosDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun providesPrestamosDb(@ApplicationContext context: Context): PrestamosDb {
        return  Room.databaseBuilder(
            context,
            PrestamosDb::class.java,
            "PrestamosDb")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun providesOcupacionDao(prestamosDb:PrestamosDb): OcupacionDao {
        return prestamosDb.ocupacionDao
    }

    @Provides
    fun providesPersonaDao(prestamosDb: PrestamosDb): PersonaDao {
        return  prestamosDb.personaDao
    }

}