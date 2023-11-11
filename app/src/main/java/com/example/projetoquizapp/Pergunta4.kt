package com.example.projetoquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetoquizapp.databinding.ActivityPergunta1Binding
import com.example.projetoquizapp.databinding.ActivityPergunta4Binding
import com.example.projetoquizapp.databinding.ActivityPergunta6Binding

class Pergunta4 : AppCompatActivity() {

    private lateinit var binding: ActivityPergunta4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta4)
        binding = ActivityPergunta4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCerto1.setOnClickListener{
            var i = Intent(this,Pergunta5::class.java)
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