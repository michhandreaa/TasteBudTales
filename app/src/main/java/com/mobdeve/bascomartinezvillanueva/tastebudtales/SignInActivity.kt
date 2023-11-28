package com.mobdeve.bascomartinezvillanueva.tastebudtales

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databaseHelpers.UserDBHelper
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databinding.MainSigninBinding

class SignInActivity : AppCompatActivity() {

    private lateinit var userDBHelper: UserDBHelper
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding: MainSigninBinding = MainSigninBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        userDBHelper = UserDBHelper(this)
        sharedPreferences = getSharedPreferences("YourSharedPreferencesName", Context.MODE_PRIVATE)

        viewBinding.signIn.setOnClickListener(View.OnClickListener {
            // Get user credentials from UI components
            val username = viewBinding.username.text.toString().trim()
            val password = viewBinding.password.text.toString().trim()
            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Username and password cannot be empty.", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }

            // Check if the user exists and the password is correct
            if (userDBHelper.isValidUser(username, password)) {
                // Save the logged-in user's username to SharedPreferences
                val editor = sharedPreferences.edit()
                editor.putString("username", username)
                editor.apply()

                // Proceed to the home activity or another screen
                startActivity(Intent(this, HomeActivity::class.java))
            } else {
                // Show an error message or take appropriate action
                // For example, you can display a Toast message
                Toast.makeText(this, "Invalid username or password.", Toast.LENGTH_SHORT).show()
            }
        })
    }
}