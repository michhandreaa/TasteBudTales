package com.mobdeve.basco.martinez.villanueva.irecipe.mco2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.HomeLandingPageScrollableBinding
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.ProfileSettingsViewBinding

class SettingsActivity : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding : ProfileSettingsViewBinding = ProfileSettingsViewBinding.inflate(layoutInflater)

        viewBinding.deleteAccountButton.setOnClickListener{
            startActivity(Intent(this, HomeLandingPageScrollableBinding::class.java))
            finish()
        }

        viewBinding.logoutbtn.setOnClickListener{
            startActivity(Intent(this, HomeLandingPageScrollableBinding::class.java))
        }
    }

}
