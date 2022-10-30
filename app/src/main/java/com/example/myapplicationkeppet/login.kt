package com.example.myapplicationkeppet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplicationkeppet.databinding.ActivityLoginBinding
import com.example.myapplicationkeppet.databinding.ActivityMainBinding

class login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)
        binding.button4.setOnClickListener {
            val usuario: String = binding.datausuario.text.toString()
            val clave: String = binding.dataclave.text.toString()
            println(usuario)
            if (usuario == "pepe" && clave == "123") {
                startActivity(Intent(this, Usuario::class.java))
                Toast.makeText(this, "datos correctos", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "datos incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}