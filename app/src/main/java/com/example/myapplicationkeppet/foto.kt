package com.example.myapplicationkeppet

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.result.contract.ActivityResultContracts
import com.example.myapplicationkeppet.databinding.ActivityFotoBinding
import com.example.myapplicationkeppet.databinding.ActivityRegistroBinding

class foto : AppCompatActivity() {
    private lateinit var binding:ActivityFotoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFotoBinding.inflate(layoutInflater)
        //val view=binding.root
        setContentView(binding.root)
        binding.btnfoto.setOnClickListener{
            abrircamara.launch(Intent(MediaStore.ACTION_IMAGE_CAPTURE))
        }
    }
    val abrircamara=registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        result->
        if(result.resultCode== RESULT_OK){
            val data=result.data!!
            val bitmap=data.extras!!.get("data")as Bitmap
            binding.imageView4.setImageBitmap(bitmap)
        }
    }
}