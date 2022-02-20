package ru.mirea.kryazhin.layouttype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val myTextView: TextView = findViewById(R.id.textViewForSecond) as TextView
        myTextView.setText("New text in Mirea")
        val button: Button = findViewById(R.id.firstbutton)
        button.setText("MireaButton")
        val checkBox: CheckBox = findViewById(R.id.checkBox)
        checkBox.setChecked(true)
    }
}