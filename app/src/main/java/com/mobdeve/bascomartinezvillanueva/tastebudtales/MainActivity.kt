package com.mobdeve.bascomartinezvillanueva.tastebudtales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databinding.MainLandingpageBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ViewBinding for the main activity layout
        val binding: MainLandingpageBinding = MainLandingpageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Click listener for the "Sign Up" button
        binding.signUp.setOnClickListener {
            // Create an Intent to navigate to the SignUpActivity
            val intent = Intent(this, SignUpActivity::class.java)

            // Start the SignUpActivity
            startActivity(intent)
        }

        // Click listener for the "Sign In" button
        binding.signIn.setOnClickListener {
            // Create an Intent to navigate to the SignInActivity
            val intent = Intent(this, SignInActivity::class.java)

            // Start the SignInActivity
            startActivity(intent)
        }
    }
}
