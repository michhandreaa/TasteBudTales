package com.mobdeve.basco.martinez.villanueva.irecipe.mco2.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.IntentKeys
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.RecipeViewActivity
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.HomeItemRecipeBinding
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.models.HomeRecipeModel
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.viewHolders.HomeRecipeViewHolder

class HomeRecipeAdapter(private val recipeList: ArrayList<HomeRecipeModel>) : RecyclerView.Adapter<HomeRecipeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeRecipeViewHolder {
        val homeItemRecipe = HomeItemRecipeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val viewHolder = HomeRecipeViewHolder(homeItemRecipe)

        viewHolder.itemView.setOnClickListener{
            val intent = Intent(viewHolder.itemView.context, RecipeViewActivity::class.java)
            val position = viewHolder.adapterPosition
            intent.putExtra(IntentKeys.RECIPE_NAME, recipeList[position].recipeName)
            intent.putExtra(IntentKeys.RECIPE_CATEGORY, recipeList[position].recipeCategory)
            intent.putExtra(IntentKeys.RECIPE_IMAGE, recipeList[position].recipeImage)
            intent.putExtra(IntentKeys.RECIPE_INGREDIENTS, recipeList[position].recipeIngredients)
            intent.putExtra(IntentKeys.RECIPE_INSTRUCTIONS, recipeList[position].recipeInstructions)
            intent.putExtra(IntentKeys.RECIPE_LIKE, recipeList[position].recipeLikes)

            ContextCompat.startActivity(viewHolder.itemView.context, intent, null)
        }

        return viewHolder
    }


    override fun onBindViewHolder(holder: HomeRecipeViewHolder, position: Int) {
        holder.bindData(recipeList[position])
    }

    override fun getItemCount(): Int {
        return 6
    }

}
