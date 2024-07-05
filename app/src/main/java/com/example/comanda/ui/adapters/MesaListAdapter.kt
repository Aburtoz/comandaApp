package com.example.comanda.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.comanda.R
import com.example.comanda.data.entities.Mesas


class MesaListAdapter : ListAdapter<Mesas,MesaListAdapter.MesaViewHolder> (MesaComparator()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MesaViewHolder {
        return MesaViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: MesaViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current)
    }

    class MesaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tituloList: TextView = itemView.findViewById(R.id.lbTittle)
        private val descrList: TextView = itemView.findViewById(R.id.lbDescription)

        fun bind(mesa: Mesas?) {
            tituloList.text =  mesa?.numero.toString()
            descrList.text  =   mesa?.description
        }

        companion object {
            fun create(parent: ViewGroup): MesaViewHolder {
                val view: View = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_mesas_list, parent, false)
                return MesaViewHolder(view)
            }
        }
    }

    class MesaComparator : DiffUtil.ItemCallback<Mesas>() {
        override fun areItemsTheSame(oldItem: Mesas, newItem: Mesas): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Mesas, newItem: Mesas): Boolean {
            return oldItem.id == newItem.id
        }
    }
}