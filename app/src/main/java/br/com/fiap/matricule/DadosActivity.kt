package br.com.fiap.matricule

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dados.*

class DadosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados)

        tvNomeAluno.text = intent.extras.getString("nome")
        tvCursoAluno.text = intent.extras.getString("curso")
    }
}
