package com.example.projetoquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetoquizapp.databinding.ActivityPergunta1Binding

class Pergunta1 : AppCompatActivity() {

    private lateinit var binding: ActivityPergunta1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta1)
        binding = ActivityPergunta1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCerto1.setOnClickListener{
            val i = Intent(this,Pergunta2::class.java)
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