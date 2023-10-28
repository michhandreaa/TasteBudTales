package com.mobdeve.basco.martinez.villanueva.irecipe.mco2.datahelpers

import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.R
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.models.RecipeModel

class RecipeGenerator {
    companion object {
        fun loadRecipe(): ArrayList<RecipeModel> {
            val recipe = ArrayList<RecipeModel>()
            recipe.add(RecipeModel("Jambalaya", "23", R.drawable.food_us_jambalaya))
            recipe.add(RecipeModel("Burrito", "83", R.drawable.food_mx_burrito))
            recipe.add(RecipeModel("Adobong Baboy", "88", R.drawable.food_ph_adobongbaboy))
            recipe.add(RecipeModel("Tori Katsu", "73", R.drawable.food_jp_torikatsu))
            return recipe
        }
    }
}