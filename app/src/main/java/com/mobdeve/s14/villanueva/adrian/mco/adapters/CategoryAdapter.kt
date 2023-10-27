package com.mobdeve.s14.villanueva.adrian.mco.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.s14.villanueva.adrian.mco.IntentKeys
import com.mobdeve.s14.villanueva.adrian.mco.SeeAllRecipeFilteredByCategory
import com.mobdeve.s14.villanueva.adrian.mco.databinding.HomeItemCategoryBinding
import com.mobdeve.s14.villanueva.adrian.mco.models.CategoryModel
import com.mobdeve.s14.villanueva.adrian.mco.viewHolders.CategoryViewHolder

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