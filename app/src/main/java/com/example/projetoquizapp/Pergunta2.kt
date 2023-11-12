package com.example.projetoquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetoquizapp.databinding.ActivityPergunta2Binding

class Pergunta2 : AppCompatActivity() {

    private lateinit var binding: ActivityPergunta2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta2)
        binding = ActivityPergunta2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCerto1.setOnClickListener{
            val i = Intent(this,Pergunta3::class.java)
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