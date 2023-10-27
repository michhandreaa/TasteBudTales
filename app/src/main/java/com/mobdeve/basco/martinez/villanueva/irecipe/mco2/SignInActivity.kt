package com.mobdeve.basco.martinez.villanueva.irecipe.mco2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.HomeLoginBinding


class SignInActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewBinding = HomeLoginBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.loginButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, HomePageActivity::class.java)
            startActivity(intent)
        })
    }
}