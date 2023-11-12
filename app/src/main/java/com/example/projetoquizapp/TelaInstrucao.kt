package com.example.projetoquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetoquizapp.databinding.ActivityTelaInstrucaoBinding

class TelaInstrucao : AppCompatActivity() {

    private lateinit var binding: ActivityTelaInstrucaoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_instrucao)
        binding = ActivityTelaInstrucaoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button5.setOnClickListener{
            var i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
    }
}