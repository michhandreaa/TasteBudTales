package com.mobdeve.basco.martinez.villanueva.irecipe.mco2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.SignInActivity
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.HomeLandingPageScrollableBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding : HomeLandingPageScrollableBinding = HomeLandingPageScrollableBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.signUp.setOnClickListener(View.OnClickListener {
            val intent : Intent = Intent (this, SignUpActivity::class.java)
            startActivity(intent)
        })

        viewBinding.signIn.setOnClickListener(View.OnClickListener {
            val intent : Intent =  Intent (this, SignInActivity::class.java)
            startActivity(intent)
        })



    }
}