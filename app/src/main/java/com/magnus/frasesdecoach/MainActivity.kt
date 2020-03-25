package com.magnus.frasesdecoach


import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity: AppCompatActivity(), View.OnClickListener {
    val frasesCoach: List<String> = ArrayList(Arrays.asList("Hj eles riem do seu sonho.Amanha riem do seu fracasso",
            "Quanto mais eu treino, mais sorte eu tenho.",
            "Controle o seu destino ou alguém controlará.",
            "Para ter um negócio de sucesso, alguém, algum dia, teve que tomar uma atitude de coragem."))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var numero = Math.random() * frasesCoach.size
        var fraseAtual = frasesCoach[numero.toInt()]
        frases.text=" ${frasesCoach[numero.toInt()]}"
        trocar.setOnClickListener {
            do {
                numero = Math.random() * frasesCoach.size
            }while (fraseAtual.equals(frasesCoach[numero.toInt()]))
            fraseAtual= frasesCoach[numero.toInt()]
            frases.text=" ${frasesCoach[numero.toInt()]}"

        }
    }
    override fun onClick(v: View?) {
    }
}
