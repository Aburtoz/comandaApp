package com.example.comanda.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(
    tableName = "rol_permisos",
    foreignKeys = [
        ForeignKey(
            entity = Categorias::class,
            parentColumns = ["id"],
            childColumns = ["categoria_id"]
        )
    ]
)
class Menu (

    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name="nombre")
    var nombre: String,

    @ColumnInfo(name="descripcion")
    var descripcion: String,

    @ColumnInfo(name="precio")
    var precio: Number,

    @ColumnInfo(name="categoria_id")
    var categoriaId: Int,

) : Serializable