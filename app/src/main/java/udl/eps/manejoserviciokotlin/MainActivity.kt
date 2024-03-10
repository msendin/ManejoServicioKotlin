package udl.eps.manejoserviciokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() , View.OnClickListener {
    private lateinit var `in`: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnInicio: Button = findViewById<Button>(R.id.btnInicio)
        val btnFin: Button = findViewById<Button>(R.id.btnFin)

        btnInicio.setOnClickListener(this)
        btnFin.setOnClickListener(this)

        `in` = Intent(this, ElServicio::class.java)
    }

    override fun onClick(src: View) {
            when(src.id) {
                R.id.btnInicio -> startService(`in`)
                R.id.btnFin -> stopService(`in`)
            }
        }
}