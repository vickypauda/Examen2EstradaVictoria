package itson.edu.mx.examen2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)


        val btnDetalles: Button = findViewById(R.id.btnDetalles)
        val btnGlobos: Button = findViewById(R.id.btnGlobos)
        val btnPeluches: Button = findViewById(R.id.btnPeluches)
        val btnRegalos: Button = findViewById(R.id.btnRegalos)
        val btnTazas: Button = findViewById(R.id.btnTazas)


        btnDetalles.setOnClickListener {

            val intent = Intent(this, Regalos::class.java)
            startActivity(intent)
        }

        btnGlobos.setOnClickListener {
            val intent = Intent(this, Globos::class.java)
            startActivity(intent)
        }

        btnPeluches.setOnClickListener {
           val intent = Intent(this, Peluches::class.java)
            startActivity(intent)
        }

        btnRegalos.setOnClickListener {
            val intent = Intent(this, Regalos::class.java)
            startActivity(intent)
        }

        btnTazas.setOnClickListener {
             val intent = Intent(this, Tazas::class.java)
            startActivity(intent)
        }
    }
}
