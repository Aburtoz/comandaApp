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
            entity = Menu::class,
            parentColumns = ["id"],
            childColumns = ["producto_id"]
        ),
        ForeignKey(
            entity = Facturas::class,
            parentColumns = ["id"],
            childColumns = ["facturas_id"]
        )
    ]
)
class FacturaDetalles (

    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name="producto_id")
    var productoId: Int,

    @ColumnInfo(name="cantidad")
    var cantidad: Int,

    @ColumnInfo(name="precio_unitario")
    var precioUnitario: Number,

    @ColumnInfo(name="facturas_id")
    var facturasId: Int,

)  : Serializable