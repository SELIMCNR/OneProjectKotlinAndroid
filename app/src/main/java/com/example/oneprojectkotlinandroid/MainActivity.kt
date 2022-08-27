package com.example.oneprojectkotlinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun Degistir(view : View){  //(objeismi : objetipi)

        textView.text = "Merhaba Android"
    }
    fun Degist(view: View){
        textView.text = "Selim Çınar"
    }

}