package com.example.comanda.data.appDatabase

import android.app.Application
import com.example.comanda.data.repository.MesaRepository
import com.example.comanda.data.repository.UsuarioRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class ComandaApplication: Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    private val database by lazy { AppDatabase.getDatabase(this,applicationScope) }
    val mesaRepository by lazy { MesaRepository(database.mesaDAO()) }
    val usuarioRepository by lazy { UsuarioRepository(database.userDao()) }
}