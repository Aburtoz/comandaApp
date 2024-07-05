package com.example.comanda.ui.viewModelFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.comanda.data.repository.MesaRepository
import com.example.comanda.ui.viewModels.MesaViewModel
import com.example.comanda.ui.viewModels.UsuarioViewModel

class MesaViewModelFactory(private val repository:MesaRepository) : ViewModelProvider.Factory {

    override  fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MesaViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return MesaViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}