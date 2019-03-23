package br.com.fiap.matricule

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_formulario.*

class FormularioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)
        btGo.setOnClickListener{
            carregarDados()
        }
    }

    fun carregarDados(){
        val proximaTela = Intent (this, DadosActivity::class.java)
        proximaTela.putExtra("nome", etNome.text.toString())
        proximaTela.putExtra("curso", spCurso.selectedItem.toString())
        startActivity(proximaTela)
        finish()
    }
}
