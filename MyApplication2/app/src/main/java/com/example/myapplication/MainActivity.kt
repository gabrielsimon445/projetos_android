package com.example.myapplication
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nomeTextView = findViewById<TextView>(R.id.texto_nome);
        val profissaoTextView = findViewById<TextView>(R.id.texto_profissao);
        val contatoTextView = findViewById<TextView>(R.id.texto_contato);

//        nomeTextView.text = "Gabriel Simon";
//        profissaoTextView.text = "Desenvolvedor Fullstack + Dev Android";
//        contatoTextView.text = "gabriel_simon1@senior.com.br";

        nomeTextView.text = getString(R.string.meu_nome);
        profissaoTextView.text = getString(R.string.minha_profissao);
        contatoTextView.text = getString(R.string.contato);

    }
}