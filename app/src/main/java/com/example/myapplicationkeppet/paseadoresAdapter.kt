package com.example.myapplicationkeppet

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class paseadoresAdapter (private val contex:Context,val listado:MutableList<Paseadores>):
        RecyclerView.Adapter<paseadoresAdapter.ViewHolder>(){
            inner class ViewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
                lateinit var datos:TextView
                init {
                    datos=itemview.findViewById(R.id.txtnombrepaseador)
                }
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemview=LayoutInflater.from(parent.context).inflate(R.layout.carpaseador,parent,false)
        return ViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val paseador=listado[position]
        holder.datos.text=paseador.nombre
    }

    override fun getItemCount(): Int {
        return listado.size
    }
}