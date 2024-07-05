package com.example.comanda.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Categorias")
class Categorias (

    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name="nombre")
    var nombre: String

) : Serializable