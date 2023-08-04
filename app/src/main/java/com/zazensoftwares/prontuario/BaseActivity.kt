package com.zazensoftwares.prontuario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zazensoftwares.prontuario.databinding.ActivityBaseBinding

class BaseActivity : AppCompatActivity(), View.OnClickListener {
 private lateinit var binding: ActivityBaseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBaseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAvancarParaNivelInconsciencia.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        if(v.id==R.id.button_avancar_para_nivel_inconsciencia){
            validar()
        }

    }

    fun validar(){
        avancarParaMensuravel()
    }

    private fun avancarParaMensuravel(){

        var intencaoFrequencia= Intent (this,FrequenciaDeInconscienciaActivity::class.java)
        startActivity(intencaoFrequencia)
        finish()
    }
}