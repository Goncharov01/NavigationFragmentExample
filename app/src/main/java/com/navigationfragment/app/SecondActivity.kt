package com.navigationfragment.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.findNavController

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val navController = findNavController(R.id.nav_host_fragment)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            navController.navigate(R.id.navigation_dashboard)

        }
    }
}