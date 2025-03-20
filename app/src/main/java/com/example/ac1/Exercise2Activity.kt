import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ac1.R

class Exercicio2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise2)

        val number1EditText = findViewById<EditText>(R.id.number1EditText)
        val number2EditText = findViewById<EditText>(R.id.number2EditText)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        val addButton = findViewById<Button>(R.id.addButton)
        val subtractButton = findViewById<Button>(R.id.subtractButton)
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        val divideButton = findViewById<Button>(R.id.divideButton)

        addButton.setOnClickListener {
            val number1 = number1EditText.text.toString().toDoubleOrNull()
            val number2 = number2EditText.text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null) {
                val result = number1 + number2
                resultTextView.text = "Resultado: $result"
            } else {
                showError()
            }
        }

        subtractButton.setOnClickListener {
            val number1 = number1EditText.text.toString().toDoubleOrNull()
            val number2 = number2EditText.text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null) {
                val result = number1 - number2
                resultTextView.text = "Resultado: $result"
            } else {
                showError()
            }
        }

        multiplyButton.setOnClickListener {
            val number1 = number1EditText.text.toString().toDoubleOrNull()
            val number2 = number2EditText.text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null) {
                val result = number1 * number2
                resultTextView.text = "Resultado: $result"
            } else {
                showError()
            }
        }

        divideButton.setOnClickListener {
            val number1 = number1EditText.text.toString().toDoubleOrNull()
            val number2 = number2EditText.text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null && number2 != 0.0) {
                val result = number1 / number2
                resultTextView.text = "Resultado: $result"
            } else if (number2 == 0.0) {
                Toast.makeText(this, "Divisão por zero não é permitida", Toast.LENGTH_SHORT).show()
            } else {
                showError()
            }
        }
    }

    private fun showError() {
        Toast.makeText(this, "Por favor, insira valores válidos", Toast.LENGTH_SHORT).show()
    }
}
