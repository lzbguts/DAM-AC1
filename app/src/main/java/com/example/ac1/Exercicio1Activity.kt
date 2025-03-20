import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ac1.R

class Exercicio1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise1)

        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val ageEditText = findViewById<EditText>(R.id.ageEditText)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val verifyButton = findViewById<Button>(R.id.verifyButton)

        verifyButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val ageText = ageEditText.text.toString()

            if (name.isEmpty() || ageText.isEmpty()) {
                Toast.makeText(this, "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val age = ageText.toIntOrNull()
            if (age != null) {
                val result = if (age >= 18) {
                    "$name é maior de idade."
                } else {
                    "$name é menor de idade."
                }
                resultTextView.text = result
            } else {
                resultTextView.text = "Idade inválida"
            }
        }
    }
}