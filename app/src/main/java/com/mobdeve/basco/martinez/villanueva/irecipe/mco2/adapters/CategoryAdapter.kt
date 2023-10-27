package com.mobdeve.basco.martinez.villanueva.irecipe.mco2.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.IntentKeys
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.SeeAllRecipeFilteredByCategory
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.HomeItemCategoryBinding
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.models.CategoryModel
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.viewHolders.CategoryViewHolder

class CategoryAdapter (private val data : ArrayList<CategoryModel>) : RecyclerView.Adapter<CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val categoryViewBinding: HomeItemCategoryBinding = HomeItemCategoryBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )

        val viewHolder  = CategoryViewHolder(categoryViewBinding)

        viewHolder.itemView.setOnClickListener{
            val intent = Intent (viewHolder.itemView.context, SeeAllRecipeFilteredByCategory::class.java) // create this class
            intent.putExtra(IntentKeys.CATEGORY_KEY, categoryViewBinding.categoryLabel.text.toString())
            startActivity(viewHolder.itemView.context, intent, null)
        }
        return viewHolder
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bindCategory(data[position])
    }

}