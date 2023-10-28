package com.mobdeve.basco.martinez.villanueva.irecipe.mco2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.SignInActivity
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.HomeSignupPageBinding

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding : HomeSignupPageBinding = HomeSignupPageBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        // query to db will be set here
        viewBinding.submitBtn.setOnClickListener(View.OnClickListener {
            startActivity(Intent (this, SignInActivity::class.java))
        })
    }
}