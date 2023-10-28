package com.mobdeve.basco.martinez.villanueva.irecipe.mco2

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.HomeAddIngredientsFormBinding

class AddIngredientFormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding : HomeAddIngredientsFormBinding = HomeAddIngredientsFormBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val ingredientCategory = arrayListOf<String>("Vegetables","Spices and Herbs","Cereals and Pulses","Meat","Dairy Products","Fruits","Seafood","Fats and oils")
        var arrayAdapterIngredientCategory : ArrayAdapter<String> = ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, ingredientCategory)

        viewBinding.actIngredientCategory.setAdapter(arrayAdapterIngredientCategory)
        viewBinding.actIngredientCategory.threshold = 1

        viewBinding.submitbtn.setOnClickListener{
            finish()
        }

    }
}