package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.helloworld.ui.theme.HelloWorldTheme
import kotlin.jvm.java

class Third_Activity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.l3)

        val btn2Navigate = findViewById<Button>(R.id.button1)

        btn2Navigate.setOnClickListener {
            val intent = Intent(this, Fourth_Activity::class.java)
            startActivity(intent)
        }
    }
}
