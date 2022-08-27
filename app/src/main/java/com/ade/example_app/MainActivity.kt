package com.ade.example_app
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlin.Exception as Exception
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnLooping = findViewById<Button>(R.id.btnEks)
        val jml = findViewById<EditText>(R.id.jumlah)
        btnLooping.setOnClickListener {
            val v = findViewById<LinearLayout>(R.id.vw)
            val total:Int = jml.text.toString().toInt()
            for (i:Int in 1..total) {
                val img = ImageView(this)
                img.layoutParams = LinearLayout.LayoutParams(200, 200)
                (img.layoutParams as LinearLayout.LayoutParams).setMargins(0, 0, 0, 15)
                img.setImageResource(R.drawable.gambar1)
                try {
                    v.addView(img)
                } catch (e: Exception) {
                    Toast.makeText(applicationContext, "Gagal", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}