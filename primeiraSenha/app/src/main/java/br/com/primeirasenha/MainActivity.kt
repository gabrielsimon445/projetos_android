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
        super.onCreate(savedInstanceState)
//        testesFeitosEmAulas()
//        exercicio1()
//        exercicio2()
//        exercicio3Calculadora(10.0, 5.0, "+")
//        exercicio3Calculadora(100.0, 2.0, "*")
//        exercicio3Calculadora(50.0, 4.0, "/")
        exercicio4IniciarContagemRegressiva(10)
    }

    private fun testesFeitosEmAulas() {
//        var TAG = "AULA 3"
//        setContentView(R.layout.activity_main)
//
//        val mensagem = findViewById<TextView>(R.id.mensagem);
//        mensagem.text = "";
//
//        val email = findViewById<EditText>(R.id.email);
//        val password = findViewById<EditText>(R.id.password);
//
//        val botao = findViewById<Button>(R.id.button);
//
//        botao.setOnClickListener {
//            if (email.text.toString().isNotBlank() && password.text.toString().isNotBlank()) {
//                mensagem.text = "Preenchido!";
//                mensagem.setTextColor(ContextCompat.getColor(this, R.color.teal_200));
//            } else {
//                mensagem.text = "Falta preencher!";
//                mensagem.setTextColor(ContextCompat.getColor(this, R.color.purple_200));
//            }
//        }
//
//        val nivelDoUsuario = 0
//        when (nivelDoUsuario) {
//            1 -> Log.d(TAG, "INICIANTE")
//            2 -> Log.d(TAG, "Intermediário")
//            3 -> Log.d(TAG, "Avançado")
//            else -> Log.d(TAG, "NÍVEL NÃO RECONHECIDO")
//        }
//
//        fun criarMensagemDeBoasVindas(nome: String): String {
//            return "Olá, $nome! Seja bem-vindo(a)."
//        }
//
//        val mensagemBoasVindas = criarMensagemDeBoasVindas("Teste")
//        Log.d(TAG, mensagemBoasVindas)
//
//        TAG = "AULA 4"
//
//        val idadeUsuario = 20
//
//        if (idadeUsuario >= 18) {
//            Log.d(TAG, "Usuário é maior de idade.")
//        } else {
//            Log.d(TAG, "Usuário é menor de idade.")
//        }
//
//        val compras = listOf("Arroz", "Feijão", "Carne")
//
//        for (item in compras) {
//            Log.d(TAG, "Item da lista: $item")
//        }
//
//        fun ehParOuImpar(valor: Int): Boolean {
//            if (valor % 2 == 0) {
//                return true
//            } else {
//                return false
//            }
//        }
//
//        Log.d(TAG, "O valor é par ${ehParOuImpar(2)}")
    }

    private fun exercicio1() {
        val TAG = "Exercício 1";
        var precoPadrao = 30.0;
        val idadeCliente = 10;

        if (idadeCliente > 60 || idadeCliente < 12) {
            precoPadrao = 15.0;
        }

        Log.d(TAG, "Cliente com " + idadeCliente + " anos\nPreço do ingresso: R$" + precoPadrao);
    }

    private fun exercicio2() {
        val TAG = "Exercício 2"
        val produtos = listOf("Sabonete", "Shampoo", "Pasta de Dente", "Fio Dental");
        val produtoEmPromocao = "Pasta de Dente"

        for (produto in produtos) {
            Log.d(TAG, "Produto: " + produto)

            if (produto == produtoEmPromocao) {
                Log.d(TAG, ">>> PRODUTO EM OFERTA!")
            }
        }
    }

    private fun exercicio3Calculadora(numeroA: Double, numeroB: Double, operacao: String) {
        val TAG = "Exercício 3";
        val mensagem = "Resultado de " + numeroA + " " + operacao + " " + numeroB + " é "
        when (operacao) {
            "+" -> Log.d(TAG, mensagem + (numeroA + numeroB))
            "-" -> Log.d(TAG, mensagem + (numeroA - numeroB))
            "*" -> Log.d(TAG, mensagem + (numeroA * numeroB))
            "/" -> Log.d(TAG, mensagem + (numeroA / numeroB))
        }
    }

    private fun exercicio4IniciarContagemRegressiva(segundos: Int) {
        val TAG = "Exercício 4";
        var contador = segundos;

        while (contador > 0) {
            Log.d(TAG, "Contagem: " + contador.toString())
            contador--;
        }

        Log.d(TAG, "Lançar!")
    }
}