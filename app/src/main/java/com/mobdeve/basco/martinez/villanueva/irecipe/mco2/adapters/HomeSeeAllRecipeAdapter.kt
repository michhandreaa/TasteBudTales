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
import java.util.ArrayList

class HomeSeeAllRecipeAdapter(private val homeRecipeList: ArrayList<HomeRecipeModel>) : RecyclerView.Adapter<HomeRecipeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeRecipeViewHolder {
        val homeItemRecipe = HomeItemRecipeBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        val viewHolder = HomeRecipeViewHolder(homeItemRecipe)

        viewHolder.itemView.setOnClickListener{
            val intent = Intent(viewHolder.itemView.context, RecipeViewActivity::class.java)
            val position = viewHolder.adapterPosition
            intent.putExtra(IntentKeys.RECIPE_NAME, homeRecipeList[position].recipeName)
            intent.putExtra(IntentKeys.RECIPE_CATEGORY, homeRecipeList[position].recipeCategory)
            intent.putExtra(IntentKeys.RECIPE_IMAGE, homeRecipeList[position].recipeImage)
            intent.putExtra(IntentKeys.RECIPE_INGREDIENTS, homeRecipeList[position].recipeIngredients)
            intent.putExtra(IntentKeys.RECIPE_INSTRUCTIONS, homeRecipeList[position].recipeInstructions)
            intent.putExtra(IntentKeys.RECIPE_LIKE, homeRecipeList[position].recipeLikes)

            ContextCompat.startActivity(viewHolder.itemView.context, intent, null)
        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: HomeRecipeViewHolder, position: Int) {

        holder.bindData(homeRecipeList[position])
    }

    override fun getItemCount(): Int {
        return homeRecipeList.size
    }

}
