package com.mobdeve.s14.villanueva.adrian.mco.viewHolders
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.s14.villanueva.adrian.mco.models.CategoryModel
import com.mobdeve.s14.villanueva.adrian.mco.databinding.HomeItemCategoryBinding

class CategoryViewHolder(private val viewBinding : HomeItemCategoryBinding) : RecyclerView.ViewHolder(viewBinding.root) {

    fun bindCategory (model : CategoryModel){
        this.viewBinding.categoryLabel.text = model.categoryName
        this.viewBinding.categoryImage.setImageResource(model.drawableImage)
    }

}