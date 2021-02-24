package ru.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        click()
        newClick()
    }

    private val outs = Output("Привет, я Игорь!", "Мне 43 года!");
    val newcopy = outs.copy(text = "Я из Ярославля!" )
    private fun click() {
        val button: Button = findViewById(R.id.click)
        button.setOnClickListener {
            val text = findViewById<TextView>(R.id.answer)
            val age = findViewById<TextView>(R.id.age)
            text.text = outs.text
            age.text = outs.age
        }
    }
    private fun newClick(){
        val button: Button = findViewById(R.id.new_click)
        button.setOnClickListener {
            val copy = findViewById<TextView>(R.id.new_copy)
            copy.text = newcopy.text
        }
    }

}