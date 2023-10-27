package com.mobdeve.basco.martinez.villanueva.irecipe.mco2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.adapters.HomeSeeAllRecipeAdapter
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.datahelpers.HomeRecipeGenerator
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.HomeSeeAllPerCategoriesRecipesBinding
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.models.HomeRecipeModel

class SeeAllRecipeFilteredByCategory: AppCompatActivity(){

    private val recipeList: ArrayList<HomeRecipeModel> = HomeRecipeGenerator.loadHomeRecipe()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding : HomeSeeAllPerCategoriesRecipesBinding = HomeSeeAllPerCategoriesRecipesBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        val intent = intent

        var filteredByCategory  = recipeList.filter { it.recipeCategory == intent.getStringExtra(
            IntentKeys.CATEGORY_KEY) }


        viewBinding.tvCategoryName.text = intent.getStringExtra(IntentKeys.CATEGORY_KEY)
        viewBinding.recipeRecyclerview.adapter = HomeSeeAllRecipeAdapter(filteredByCategory as ArrayList<HomeRecipeModel>)
        viewBinding.recipeRecyclerview.layoutManager = GridLayoutManager(this, 2)


    }

}
