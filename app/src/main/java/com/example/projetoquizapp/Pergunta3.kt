package com.example.projetoquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetoquizapp.databinding.ActivityPergunta1Binding
import com.example.projetoquizapp.databinding.ActivityPergunta2Binding
import com.example.projetoquizapp.databinding.ActivityPergunta6Binding

class Pergunta3 : AppCompatActivity() {

    private lateinit var binding: ActivityPergunta6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta6)
        binding = ActivityPergunta6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCerto1.setOnClickListener{
            var i = Intent(this,Pergunta4::class.java)
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