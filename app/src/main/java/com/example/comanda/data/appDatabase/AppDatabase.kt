package com.example.comanda.data.appDatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.comanda.data.dao.MesaDAO
import com.example.comanda.data.dao.UsuarioDAO
import com.example.comanda.data.entities.Mesas
import com.example.comanda.data.entities.Usuarios
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Database(entities = [Usuarios::class,Mesas::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UsuarioDAO
    abstract fun mesaDAO(): MesaDAO

    companion object {

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope): AppDatabase {

            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "comanda_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}