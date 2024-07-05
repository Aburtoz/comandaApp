package com.example.comanda.ui.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.comanda.data.entities.Mesas
import com.example.comanda.data.repository.MesaRepository
import kotlinx.coroutines.launch

class MesaViewModel(private val repository: MesaRepository) : ViewModel() {

    val allMesa: LiveData<List<Mesas>> = repository.allMesas.asLiveData()

    fun insert(mesas: Mesas) = viewModelScope.launch {
        repository.insert(mesas)
    }

}