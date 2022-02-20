package ru.mirea.kryazhin.clickbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvOut = findViewById(R.id.tvOut) as TextView
        val btnOk: Button = findViewById(R.id.btnOk) as Button
        val btnCancel: Button = findViewById(R.id.btnCancel) as Button
        btnOk.setOnClickListener {
            tvOut.text = "Нажата кнопка OK"
        }
        btnCancel.setOnClickListener {
            tvOut.text = "Нажата кнопка Cancel"
        }
    }
}