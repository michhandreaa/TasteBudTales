package com.mobdeve.s14.villanueva.adrian.mco.viewHolders

import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.s14.villanueva.adrian.mco.databinding.HomeItemRecipeBinding
import com.mobdeve.s14.villanueva.adrian.mco.models.HomeRecipeModel

class HomeRecipeViewHolder(private val viewBinding: HomeItemRecipeBinding): RecyclerView.ViewHolder(viewBinding.root) {
    fun bindData (homeRecipe : HomeRecipeModel){
        this.viewBinding.tvImageLabel.text = homeRecipe.recipeName
        this.viewBinding.ivRecipeImage.setImageResource(homeRecipe.recipeImage)
    }
}
