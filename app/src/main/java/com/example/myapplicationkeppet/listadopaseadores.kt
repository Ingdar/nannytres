package com.example.myapplicationkeppet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.myapplicationkeppet.databinding.ActivityFotoBinding
import com.example.myapplicationkeppet.databinding.ActivityListadopaseadoresBinding

class listadopaseadores : AppCompatActivity() {
    private lateinit var binding:ActivityListadopaseadoresBinding
    private val listadop:MutableList<Paseadores> =mutableListOf()
    private lateinit var recycler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityListadopaseadoresBinding.inflate(layoutInflater)
        setContentView(binding.root)
        listadop.add(Paseadores(nombre = "Pepe","Pepe@gmail.com"))
        listadop.add(Paseadores(nombre = "ana","Pepe@gmail.com"))
        listadop.add(Paseadores(nombre = "ramon","Pepe@gmail.com"))
        listadop.add(Paseadores(nombre = "juan","Pepe@gmail.com"))
        listadop.add(Paseadores(nombre = "lucas","Pepe@gmail.com"))
        listadop.add(Paseadores(nombre = "lina","Pepe@gmail.com"))
        listadop.add(Paseadores(nombre = "raul","Pepe@gmail.com"))
        estableceradapter()
    }

    private fun estableceradapter(){
        recycler=binding.listarecicler
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=paseadoresAdapter(this,listadop)
    }
}