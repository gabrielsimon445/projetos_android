package br.com.primeirasenha

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var TAG = "AULA 3"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mensagem = findViewById<TextView>(R.id.mensagem);
        mensagem.text = "";

        val email = findViewById<EditText>(R.id.email);
        val password = findViewById<EditText>(R.id.password);

        val botao = findViewById<Button>(R.id.button);

        botao.setOnClickListener {
            if (email.text.toString().isNotBlank() && password.text.toString().isNotBlank()) {
                mensagem.text = "Preenchido!";
                mensagem.setTextColor(ContextCompat.getColor(this, R.color.teal_200));
            } else {
                mensagem.text = "Falta preencher!";
                mensagem.setTextColor(ContextCompat.getColor(this, R.color.purple_200));
            }
        }

        val nivelDoUsuario = 0
        when(nivelDoUsuario) {
            1 -> Log.d(TAG, "INICIANTE")
            2 -> Log.d(TAG, "Intermediário")
            3 -> Log.d(TAG, "Avançado")
            else -> Log.d(TAG, "NÍVEL NÃO RECONHECIDO")
        }

        fun criarMensagemDeBoasVindas(nome: String): String {
            return "Olá, $nome! Seja bem-vindo(a)."
        }

        val mensagemBoasVindas = criarMensagemDeBoasVindas("Teste")
        Log.d(TAG, mensagemBoasVindas)

        TAG = "AULA 4"

        val idadeUsuario = 20

        if (idadeUsuario >= 18) {
            Log.d(TAG, "Usuário é maior de idade.")
        } else {
            Log.d(TAG, "Usuário é menor de idade.")
        }

        val compras = listOf("Arroz", "Feijão", "Carne")

        for (item in compras) {
            Log.d(TAG, "Item da lista: $item")
        }

        fun ehParOuImpar(valor: Int): Boolean {
            if (valor % 2 == 0) {
                return true
            } else {
                return  false
            }
        }

        Log.d(TAG,"O valor é par ${ehParOuImpar(2)}")
    }
}