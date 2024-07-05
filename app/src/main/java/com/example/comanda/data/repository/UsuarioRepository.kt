package com.example.comanda.data.repository

import android.support.annotation.WorkerThread
import com.example.comanda.data.dao.UsuarioDAO
import com.example.comanda.data.entities.Usuarios
import kotlinx.coroutines.flow.Flow

class UsuarioRepository(private val usuarioDao: UsuarioDAO)  {

    val allUsuario: Flow<List<Usuarios>> = usuarioDao.getAll()


    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(usuario: Usuarios) {
        usuarioDao.insert(usuario)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun update(usuario: Usuarios){
        usuarioDao.update(usuario)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun delete(usuario: Usuarios){
        usuarioDao.delete(usuario)
    }

}