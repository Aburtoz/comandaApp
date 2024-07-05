package com.example.comanda.ui.viewModelFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.comanda.data.repository.UsuarioRepository
import com.example.comanda.ui.viewModels.UsuarioViewModel

class UsuarioViewModelFactory(private val repository: UsuarioRepository): ViewModelProvider.Factory {

    override  fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UsuarioViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return UsuarioViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}