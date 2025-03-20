package com.example.ac1

import Exercicio1Activity
import Exercicio2Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.ac1.ui.theme.AC1Theme
import com.example.exercicio4.Exercicio4Activity
import com.example.exercicio5.Exercicio5Activity
import com.example.loja.Exercicio3Activity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonExercicio1 = findViewById<Button>(R.id.buttonExercicio1)
        val buttonExercicio2 = findViewById<Button>(R.id.buttonExercicio2)
        val buttonExercicio3 = findViewById<Button>(R.id.buttonExercicio3)
        val buttonExercicio4 = findViewById<Button>(R.id.buttonExercicio4)
        val buttonExercicio5 = findViewById<Button>(R.id.buttonExercicio5)

        buttonExercicio1.setOnClickListener {
            val intent = Intent(this, Exercicio1Activity::class.java)
            startActivity(intent)
        }

        buttonExercicio2.setOnClickListener {
            val intent = Intent(this, Exercicio2Activity::class.java)
            startActivity(intent)
        }

        buttonExercicio3.setOnClickListener {
            val intent = Intent(this, Exercicio3Activity::class.java)
            startActivity(intent)
        }

        buttonExercicio4.setOnClickListener {
            val intent = Intent(this, Exercicio4Activity::class.java)
            startActivity(intent)
        }

        buttonExercicio5.setOnClickListener {
            val intent = Intent(this, Exercicio5Activity::class.java)
            startActivity(intent)
        }
    }
}



