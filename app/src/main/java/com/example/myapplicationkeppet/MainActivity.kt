package com.example.myapplicationkeppet

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.view.View
import android.widget.Toast
import com.example.myapplicationkeppet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_MyApplicationKeppet)
        Thread.sleep(3000)
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        binding.button.setOnClickListener {
            startActivity(Intent(this, somos::class.java))
            Toast.makeText(this, "diste click en somos", Toast.LENGTH_LONG).show()
        }
            binding.button2.setOnClickListener{
            startActivity(Intent(this,login::class.java))

        }
        binding.button3.setOnClickListener{
            startActivity(Intent(this, registro::class.java))
        }
    }
}