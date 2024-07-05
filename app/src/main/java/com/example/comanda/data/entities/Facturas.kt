package com.example.comanda.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import java.io.Serializable
import java.time.LocalDateTime


@Entity(
    tableName = "facturas",
    foreignKeys = [
        ForeignKey(
            entity = Mesas::class,
            parentColumns = ["id"],
            childColumns = ["mesa_id"]
        ),
        ForeignKey(
            entity = Usuarios::class,
            parentColumns = ["id"],
            childColumns = ["mesero_id"]
        ),
        ForeignKey(
            entity = Facturas::class,
            parentColumns = ["id"],
            childColumns = ["facturas_id"]
        )
    ]
)
class Facturas (

    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name="mesa_id")
    var mesaId: Int,

    @ColumnInfo(name="mesero_id")
    var meseroId: Int,

    @ColumnInfo(name="fecha_hora")
    var fechaHora: LocalDateTime,

    @ColumnInfo(name="total")
    var total: Number,

    @ColumnInfo(name="pagado", defaultValue= "false")
    var pagado: Boolean,

    @ColumnInfo(name="facturas_id")
    var facturasId: Int


) : Serializable