package com.example.comanda.ui

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.comanda.data.appDatabase.ComandaApplication
import com.example.comanda.databinding.ActivityMesasBinding
import com.example.comanda.ui.adapters.MesaListAdapter
import com.example.comanda.ui.viewModelFactory.MesaViewModelFactory
import com.example.comanda.ui.viewModels.MesaViewModel

class MesasActivity : AppCompatActivity() {

    private val newWordActivityRequestCode = 1

    private val mesaViewModel: MesaViewModel by viewModels {
        MesaViewModelFactory((application as ComandaApplication).mesaRepository)
    }

    private lateinit var binding: ActivityMesasBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMesasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recv  = binding.recyclerview
        val mesaAdapter = MesaListAdapter()
        recv.adapter = mesaAdapter
        recv.layoutManager = LinearLayoutManager(this)
    }
}