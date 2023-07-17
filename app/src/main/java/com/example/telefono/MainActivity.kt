package com.example.telefono

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var phoneImageButton: ImageButton
    private lateinit var messageTextView: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        phoneImageButton = findViewById(R.id.phoneImageButton)
        messageTextView = findViewById(R.id.messageTextView)

        phoneImageButton.setOnClickListener {
            messageTextView.text = "Llamando"
        }
    }
}
