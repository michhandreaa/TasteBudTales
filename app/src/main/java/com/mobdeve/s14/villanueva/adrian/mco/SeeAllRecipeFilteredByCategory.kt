package com.mobdeve.s14.villanueva.adrian.mco

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.mobdeve.s14.villanueva.adrian.mco.adapters.HomeSeeAllRecipeAdapter
import com.mobdeve.s14.villanueva.adrian.mco.datahelpers.HomeRecipeGenerator
import com.mobdeve.s14.villanueva.adrian.mco.models.HomeRecipeModel
import com.mobdeve.s14.villanueva.adrian.mco.databinding.HomeSeeAllPerCategoriesRecipesBinding

class SeeAllRecipeFilteredByCategory: AppCompatActivity(){

    private val recipeList: ArrayList<HomeRecipeModel> = HomeRecipeGenerator.loadHomeRecipe()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding : HomeSeeAllPerCategoriesRecipesBinding = HomeSeeAllPerCategoriesRecipesBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        val intent = intent

        var filteredByCategory  = recipeList.filter { it.recipeCategory == intent.getStringExtra(IntentKeys.CATEGORY_KEY) }


        viewBinding.tvCategoryName.text = intent.getStringExtra(IntentKeys.CATEGORY_KEY)
        viewBinding.recipeRecyclerview.adapter = HomeSeeAllRecipeAdapter(filteredByCategory as ArrayList<HomeRecipeModel>)
        viewBinding.recipeRecyclerview.layoutManager = GridLayoutManager(this, 2)


    }

}
