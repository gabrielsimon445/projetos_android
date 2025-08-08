package br.com.primeirasenha

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mensagem = findViewById<TextView>(R.id.mensagem);
        mensagem.text = "";


        val email = findViewById<TextView>(R.id.email);
        val password = findViewById<TextView>(R.id.password);

        val botao = findViewById<TextView>(R.id.button);

        botao.setOnClickListener {
            if (email.text.toString().isNotBlank() && password.text.toString().isNotBlank()) {
                mensagem.text = "Preenchido!";
                mensagem.setTextColor(ContextCompat.getColor(this, R.color.teal_200));
            } else {
                mensagem.text = "Falta preencher!";
                mensagem.setTextColor(ContextCompat.getColor(this, R.color.purple_200));
            }
        }
    }
}