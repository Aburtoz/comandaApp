package com.example.comanda.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.comanda.data.entities.Usuarios
import kotlinx.coroutines.flow.Flow

@Dao
interface UsuarioDAO {

    @Query("SELECT * FROM Usuarios")
    fun getAll(): Flow<List<Usuarios>>

    @Update
    fun update(user: Usuarios)

    @Insert
    fun insert(user: Usuarios)

    @Delete
    fun delete(user: Usuarios)
}