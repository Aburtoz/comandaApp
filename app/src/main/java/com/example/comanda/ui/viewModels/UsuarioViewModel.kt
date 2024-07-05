package com.example.comanda.ui.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.comanda.data.entities.Usuarios
import com.example.comanda.data.repository.UsuarioRepository
import kotlinx.coroutines.launch

class UsuarioViewModel(private val repository: UsuarioRepository) : ViewModel() {

    val allUsuario: LiveData<List<Usuarios>> = repository.allUsuario.asLiveData()

    fun insert(usuario: Usuarios) = viewModelScope.launch {
        repository.insert(usuario)
    }

}