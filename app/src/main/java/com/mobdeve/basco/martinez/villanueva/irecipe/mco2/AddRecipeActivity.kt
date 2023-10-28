package com.mobdeve.basco.martinez.villanueva.irecipe.mco2

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.R
import androidx.appcompat.app.AppCompatActivity
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.HomeAddRecipeBinding

class AddRecipeActivity : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding : HomeAddRecipeBinding = HomeAddRecipeBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val recipeCategory = arrayListOf<String>("American","Filipino","Italian","Japan","Mexican")
        var arrayAdapterRecipeCategory : ArrayAdapter<String> = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, recipeCategory)

        viewBinding.actRecipeCategory.setAdapter(arrayAdapterRecipeCategory)
        viewBinding.actRecipeCategory.threshold = 1
        viewBinding.recipeformSubmitbtn.setOnClickListener{
            finish()
        }
    }
}