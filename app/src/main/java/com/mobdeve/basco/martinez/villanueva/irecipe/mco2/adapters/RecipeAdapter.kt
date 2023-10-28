package com.mobdeve.basco.martinez.villanueva.irecipe.mco2.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.SearchItemRecipeBinding
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.models.RecipeModel
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.viewHolders.RecipeViewHolder

class RecipeAdapter (private val recipe: ArrayList<RecipeModel>): RecyclerView.Adapter<RecipeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val recipeViewBinding: SearchItemRecipeBinding = SearchItemRecipeBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)
        return RecipeViewHolder(recipeViewBinding)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bindRecipe(this.recipe[position])
    }

    override fun getItemCount(): Int {
        return recipe.size
    }

}