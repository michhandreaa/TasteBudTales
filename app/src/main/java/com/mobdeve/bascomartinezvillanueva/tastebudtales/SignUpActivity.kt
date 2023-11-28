package com.mobdeve.bascomartinezvillanueva.tastebudtales

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databaseHelpers.UserDBHelper
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databinding.MainSignupBinding
import java.util.regex.Pattern

class SignUpActivity : AppCompatActivity() {

    private lateinit var userDBHelper: UserDBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding: MainSignupBinding = MainSignupBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        userDBHelper = UserDBHelper(this)

        viewBinding.submitBtn.setOnClickListener {
            // Get user details from UI components
            val fullName = viewBinding.editTextName.text.toString().trim()
            val email = viewBinding.editTextEmail.text.toString().trim()
            val username = viewBinding.editTextUsername.text.toString().trim()
            val password = viewBinding.editTextPassword.text.toString().trim()
            val retypePassword = viewBinding.editTextReTypedPassword.text.toString().trim()

            // Check if the passwords match
            if (password != retypePassword) {
                Toast.makeText(this, "Passwords do not match. Please retype your password.", Toast.LENGTH_SHORT).show()
            } else if (password.isEmpty()) {
                Toast.makeText(this, "Password cannot be empty", Toast.LENGTH_SHORT).show()
            } else if (!isEmailValid(email)) {
                Toast.makeText(this, "Invalid email format", Toast.LENGTH_SHORT).show()
            } else if (userDBHelper.doesUserExist(username)) {
                Toast.makeText(this, "Username already exists. Choose a different username.", Toast.LENGTH_SHORT).show()
            } else {
                // Add user to the local database
                userDBHelper.addUser(fullName, email, username, password)

                // Provide feedback to the user
                Toast.makeText(this, "Sign up successful! Proceed to sign in.", Toast.LENGTH_SHORT).show()

                // Proceed to the sign-in activity
                startActivity(Intent(this, SignInActivity::class.java))
            }
        }
    }

    private fun isEmailValid(email: String): Boolean {
        val pattern = Pattern.compile(android.util.Patterns.EMAIL_ADDRESS.pattern())
        return pattern.matcher(email).matches()
    }
}
