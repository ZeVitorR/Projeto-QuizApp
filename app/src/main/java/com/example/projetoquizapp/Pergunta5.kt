package com.example.projetoquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetoquizapp.databinding.ActivityPergunta1Binding
import com.example.projetoquizapp.databinding.ActivityPergunta5Binding

class Pergunta5 : AppCompatActivity() {

    private lateinit var binding: ActivityPergunta5Binding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta5)
        binding = ActivityPergunta5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCerto1.setOnClickListener{
            var i = Intent(this,TelaFinal::class.java)
            startActivity(i)
        }

        binding.buttonErrado1.setOnClickListener{
            var i = Intent(this,TelaErro::class.java)
            startActivity(i)
        }

        binding.buttonErrado2.setOnClickListener{
            var i = Intent(this,TelaErro::class.java)
            startActivity(i)
        }

        binding.buttonErrado3.setOnClickListener{
            var i = Intent(this,TelaErro::class.java)
            startActivity(i)
        }
    }
}