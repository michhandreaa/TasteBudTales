package com.mobdeve.bascomartinezvillanueva.tastebudtales.databaseHelpers

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mobdeve.bascomartinezvillanueva.tastebudtales.R
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databinding.ItemRecipeBinding
import com.mobdeve.bascomartinezvillanueva.tastebudtales.models.Recipe

interface RecipeClickListener {
    fun onRecipeClick(recipe: Recipe)
}

class RecipeAdapter(var recipes: List<Recipe>) :
    RecyclerView.Adapter<RecipeViewHolder>() {

    private var recipeClickListener: RecipeClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val itemViewBinding =
            ItemRecipeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(itemViewBinding)
    }

    fun setRecipeClickListener(listener: RecipeClickListener) {
        this.recipeClickListener = listener
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val recipe = recipes[position]
        holder.bindRecipe(recipe)

        holder.itemView.setOnClickListener {
            recipeClickListener?.onRecipeClick(recipe)
        }
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
