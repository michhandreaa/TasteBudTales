package com.mobdeve.bascomartinezvillanueva.tastebudtales.databaseHelpers

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mobdeve.bascomartinezvillanueva.tastebudtales.R
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databinding.ItemRecipeBinding
import com.mobdeve.bascomartinezvillanueva.tastebudtales.models.Recipe

class RecipeAdapter(var recipes: List<Recipe>) :
    RecyclerView.Adapter<RecipeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val itemViewBinding =
            ItemRecipeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(itemViewBinding)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bindRecipe(recipes[position])
    }

    override fun getItemCount(): Int {
        return recipes.size
    }

    // Add this method to update the recipes in the adapter
    fun updateRecipes(newRecipes: List<Recipe>) {
        Log.d("ADAPTER_UPDATE", "Updating recipes: $newRecipes")
        recipes = newRecipes
        notifyDataSetChanged()
    }

}

class RecipeViewHolder(private val itemViewBinding: ItemRecipeBinding) :
    RecyclerView.ViewHolder(itemViewBinding.root) {

    fun bindRecipe(recipe: Recipe) {
        itemViewBinding.textViewRecipeName.text = recipe.title
        Glide.with(itemViewBinding.root.context)
            .load(recipe.image)
            .placeholder(R.drawable.food_sample) // Add a placeholder drawable
            .error(R.drawable.broken_image) // Add an error drawable
            .into(itemViewBinding.foodRecipe)
    }
}
