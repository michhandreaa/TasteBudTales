package com.mobdeve.s14.villanueva.adrian.mco;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.mobdeve.s14.villanueva.adrian.mco.databinding.HomeSignupPageBinding;

class SignUpActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewBinding = HomeSignupPageBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}