package com.example.loja

import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ac1.R

class Exercicio3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicio3)

        // Referências para os campos de entrada
        val nomeEditText = findViewById<EditText>(R.id.nomeEditText)
        val idadeEditText = findViewById<EditText>(R.id.idadeEditText)
        val ufSpinner = findViewById<Spinner>(R.id.ufSpinner)
        val cidadeEditText = findViewById<EditText>(R.id.cidadeEditText)
        val telefoneEditText = findViewById<EditText>(R.id.telefoneEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)

        val tamanhoRadioGroup = findViewById<RadioGroup>(R.id.tamanhoRadioGroup)
        val tamanhoRadioButtonP = findViewById<RadioButton>(R.id.radioButtonP)
        val tamanhoRadioButtonM = findViewById<RadioButton>(R.id.radioButtonM)
        val tamanhoRadioButtonG = findViewById<RadioButton>(R.id.radioButtonG)

        val coresCheckBox1 = findViewById<CheckBox>(R.id.checkBoxPreto)
        val coresCheckBox2 = findViewById<CheckBox>(R.id.checkBoxBranco)
        val coresCheckBox3 = findViewById<CheckBox>(R.id.checkBoxAzul)
        val coresCheckBox4 = findViewById<CheckBox>(R.id.checkBoxVermelho)

        val salvarButton = findViewById<Button>(R.id.salvarButton)

        // Lista de UFs (Estado)
        val ufs = listOf("Selecione", "SP", "RJ", "MG", "BA", "RS", "PR")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, ufs)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        ufSpinner.adapter = adapter

        ufSpinner.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>, view: View?, position: Int, id: Long) {
                // Ação quando um estado for selecionado, caso precise.
            }

            override fun onNothingSelected(parentView: AdapterView<*>) {
                // Ação quando nada for selecionado.
            }
        }

        salvarButton.setOnClickListener {
            val nome = nomeEditText.text.toString()
            val idadeText = idadeEditText.text.toString()
            val cidade = cidadeEditText.text.toString()
            val telefone = telefoneEditText.text.toString()
            val email = emailEditText.text.toString()
            val uf = ufSpinner.selectedItem.toString()

            val idade = idadeText.toIntOrNull()

            if (nome.isEmpty() || idade == null || cidade.isEmpty() || telefone.isEmpty() || email.isEmpty() || uf == "Selecione") {
                Toast.makeText(this, "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Verificando o tamanho
            val tamanho = when (tamanhoRadioGroup.checkedRadioButtonId) {
                R.id.radioButtonP -> "P"
                R.id.radioButtonM -> "M"
                R.id.radioButtonG -> "G"
                else -> "Não selecionado"
            }

            // Cores selecionadas
            val coresSelecionadas = mutableListOf<String>()
            if (coresCheckBox1.isChecked) coresSelecionadas.add("Preto")
            if (coresCheckBox2.isChecked) coresSelecionadas.add("Branco")
            if (coresCheckBox3.isChecked) coresSelecionadas.add("Azul")
            if (coresCheckBox4.isChecked) coresSelecionadas.add("Vermelho")

            // Exibindo os dados
            val usuarioInfo = """
                Nome: $nome
                Idade: $idade
                UF: $uf
                Cidade: $cidade
                Telefone: $telefone
                Email: $email
                Tamanho: $tamanho
                Cores Preferidas: ${coresSelecionadas.joinToString(", ")}
            """.trimIndent()

            Toast.makeText(this, usuarioInfo, Toast.LENGTH_LONG).show()
        }
    }
}
