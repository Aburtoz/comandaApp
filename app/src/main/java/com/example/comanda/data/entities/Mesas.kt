package com.example.comanda.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "mesas")
class Mesas (

    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name="description")
    var description: String,

    @ColumnInfo(name="numero")
    var numero: Int,

    @ColumnInfo(name="capacidad")
    var capacidad: Int,


) : Serializable