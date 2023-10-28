package com.mobdeve.basco.martinez.villanueva.irecipe.mco2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.HomeSeeAllRecipeBinding

class SeeAllRecipeActivity: AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding : HomeSeeAllRecipeBinding = HomeSeeAllRecipeBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }

}
