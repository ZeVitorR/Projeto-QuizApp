package com.example.projetoquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetoquizapp.databinding.ActivityPergunta3Binding

class Pergunta3 : AppCompatActivity() {

    private lateinit var binding: ActivityPergunta3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta3)
        binding = ActivityPergunta3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCerto1.setOnClickListener{
            val i = Intent(this,Pergunta4::class.java)
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