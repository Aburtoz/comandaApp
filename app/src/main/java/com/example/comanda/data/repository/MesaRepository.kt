package com.example.comanda.data.repository

import android.support.annotation.WorkerThread
import com.example.comanda.data.dao.MesaDAO
import com.example.comanda.data.entities.Mesas
import kotlinx.coroutines.flow.Flow

class MesaRepository(private val mesaDao: MesaDAO) {

    val allMesas: Flow<List<Mesas>> = mesaDao.getAll()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(mesa: Mesas) {
        mesaDao.insert(mesa)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun update(mesa: Mesas){
        mesaDao.update(mesa)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun delete(mesa: Mesas){
        mesaDao.delete(mesa)
    }

}