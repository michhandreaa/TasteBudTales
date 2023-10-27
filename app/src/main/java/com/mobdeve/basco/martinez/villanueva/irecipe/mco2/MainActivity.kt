package com.mobdeve.basco.martinez.villanueva.irecipe.mco2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.HomeLandingPageBinding


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