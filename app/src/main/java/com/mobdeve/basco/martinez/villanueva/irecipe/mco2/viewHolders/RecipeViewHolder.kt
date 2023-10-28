package com.mobdeve.basco.martinez.villanueva.irecipe.mco2.viewHolders

import android.annotation.SuppressLint
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.SearchItemRecipeBinding
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.models.RecipeModel

class RecipeViewHolder (private val viewBinding: SearchItemRecipeBinding): RecyclerView.ViewHolder(viewBinding.root) {

    @SuppressLint("SetTextI18n")
    fun bindRecipe (recipe: RecipeModel) {
        this.viewBinding.tvRecipe.text = recipe.recipeName
        this.viewBinding.tvLikes.text = recipe.likes + " likes"
        this.viewBinding.ivRecipe.setImageResource(recipe.imageId)
    }

}