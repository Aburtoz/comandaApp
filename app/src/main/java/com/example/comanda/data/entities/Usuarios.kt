package com.example.comanda.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable


@Entity(tableName = "usuarios")
class Usuarios (

    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name="nombre")
    var nombre: String,

    @ColumnInfo(name="correo")
    var correo: String,

    @ColumnInfo(name="password")
    var password: String

) : Serializable