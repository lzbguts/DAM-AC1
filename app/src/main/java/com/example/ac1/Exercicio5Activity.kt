package com.example.exercicio5

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import android.widget.LinearLayout
import com.example.ac1.R

class Exercicio5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicio5)

        // Referências para os CheckBoxes
        val receiveNotificationsCheckBox = findViewById<CheckBox>(R.id.receiveNotificationsCheckBox)
        val darkModeCheckBox = findViewById<CheckBox>(R.id.darkModeCheckBox)
        val rememberLoginCheckBox = findViewById<CheckBox>(R.id.rememberLoginCheckBox)
        val savePreferencesButton = findViewById<Button>(R.id.savePreferencesButton)

        // Evento de click do botão "Salvar Preferências"
        savePreferencesButton.setOnClickListener {
            // Lista de preferências selecionadas
            val selectedOptions = mutableListOf<String>()

            if (receiveNotificationsCheckBox.isChecked) {
                selectedOptions.add("Receber notificações")
            }
            if (darkModeCheckBox.isChecked) {
                selectedOptions.add("Modo escuro")
            }
            if (rememberLoginCheckBox.isChecked) {
                selectedOptions.add("Lembrar login")
            }

            // Exibe a mensagem com as preferências selecionadas
            val message = if (selectedOptions.isEmpty()) {
                "Nenhuma preferência foi escolhida"
            } else {
                selectedOptions.joinToString(", ")
            }

            // Exibe a mensagem em um Toast
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }
}
