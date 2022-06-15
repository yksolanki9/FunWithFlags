package com.example.funwithflags

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<MaterialButton>(R.id.btn_start)
        val etName = findViewById<TextInputEditText>(R.id.et_name)

        btnStart.setOnClickListener {
            etName.text?.let {
                if(it.isEmpty()) {
                    Toast.makeText(this, "Please enter a valid name", Toast.LENGTH_SHORT).show()
                } else {
                    val intent = Intent(this, QuestionsActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }
    }
}