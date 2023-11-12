package com.example.projetoquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetoquizapp.databinding.ActivityPergunta4Binding

class Pergunta4 : AppCompatActivity() {

    private lateinit var binding: ActivityPergunta4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta4)
        binding = ActivityPergunta4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCerto1.setOnClickListener{
            val i = Intent(this,Pergunta5::class.java)
            startActivity(i)
        }

        binding.buttonErrado1.setOnClickListener{
            val i = Intent(this,TelaErro::class.java)
            startActivity(i)
        }

        binding.buttonErrado2.setOnClickListener{
            val i = Intent(this,TelaErro::class.java)
            startActivity(i)
        }

        binding.buttonErrado3.setOnClickListener{
            val i = Intent(this,TelaErro::class.java)
            startActivity(i)
        }
    }
}