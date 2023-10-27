package com.mobdeve.basco.martinez.villanueva.irecipe.mco2.viewHolders

import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.HomeItemRecipeBinding
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.models.HomeRecipeModel

class HomeRecipeViewHolder(private val viewBinding: HomeItemRecipeBinding): RecyclerView.ViewHolder(viewBinding.root) {
    fun bindData (homeRecipe : HomeRecipeModel){
        this.viewBinding.tvImageLabel.text = homeRecipe.recipeName
        this.viewBinding.ivRecipeImage.setImageResource(homeRecipe.recipeImage)
    }
}
