package com.mobdeve.s14.villanueva.adrian.mco

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.mobdeve.s14.villanueva.adrian.mco.databinding.HomeLandingPageBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding = HomeLandingPageBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.landBtnSignIn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        })

        viewBinding.landBtnSignUp.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        })
    }
}