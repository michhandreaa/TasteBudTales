package com.mobdeve.basco.martinez.villanueva.irecipe.mco2.viewHolders
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.HomeItemCategoryBinding
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.models.CategoryModel


class CategoryViewHolder(private val viewBinding : HomeItemCategoryBinding) : RecyclerView.ViewHolder(viewBinding.root) {

    fun bindCategory (model : CategoryModel){
        this.viewBinding.categoryLabel.text = model.categoryName
        this.viewBinding.categoryImage.setImageResource(model.drawableImage)
    }

}