package com.mobdeve.basco.martinez.villanueva.irecipe.mco2.datahelpers

import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.R
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.models.CategoryModel

class CategoryGenerator {
    companion object {
        fun loadCategory(): ArrayList<CategoryModel> {
            val categories = ArrayList<CategoryModel>()
            categories.add(CategoryModel("Dessert", R.drawable.dessert))
            categories.add(CategoryModel("Natural Food", R.drawable.natural_food))
            categories.add(CategoryModel("Noodles", R.drawable.noodles))
            categories.add(CategoryModel("Organic Food", R.drawable.organic_food))
            categories.add(CategoryModel("Rice Bowls", R.drawable.rice_bowl))
            categories.add(CategoryModel("Seafood", R.drawable.seafood))
            categories.add(CategoryModel("Vegetarian", R.drawable.vegetarian))
            return categories
        }
    }
}