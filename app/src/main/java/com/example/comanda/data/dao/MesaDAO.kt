package com.example.comanda.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.comanda.data.entities.Mesas
import kotlinx.coroutines.flow.Flow

@Dao
interface MesaDAO {

    @Query("SELECT * FROM mesas")
    fun getAll(): Flow<List<Mesas>>

    @Update
    fun update(mesas: Mesas)

    @Insert
    fun insert(mesas: Mesas)

    @Delete
    fun delete(mesas: Mesas)
}