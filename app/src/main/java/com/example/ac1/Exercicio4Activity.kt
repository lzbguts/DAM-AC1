package com.example.exercicio4

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.example.ac1.R

class Exercicio4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicio4)

        // Referências para os campos de entrada
        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val checkboxesLayout = findViewById<LinearLayout>(R.id.checkboxesLayout)
        val nameTextView = findViewById<TextView>(R.id.nameTextView)

        val checkboxes = mutableMapOf<Char, CheckBox>()

        nameEditText.addTextChangedListener {
            val name = it.toString()
            nameTextView.text = "Nome: $name"

            // Limpa os CheckBoxes anteriores
            checkboxesLayout.removeAllViews()

            // Cria novos CheckBoxes baseados nos caracteres do nome
            name.forEach { char ->
                val checkBox = CheckBox(this)
                checkBox.text = char.toString()
                checkBox.setOnCheckedChangeListener { _, isChecked ->
                    checkboxes[char] = checkBox
                }
                checkboxes[char] = checkBox
                checkboxesLayout.addView(checkBox)
            }
        }
    }
}
