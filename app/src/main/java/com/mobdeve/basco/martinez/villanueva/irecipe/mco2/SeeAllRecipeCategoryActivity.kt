package com.mobdeve.basco.martinez.villanueva.irecipe.mco2

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.HomeSeeAllCategoryBinding

class SeeAllRecipeCategoryActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewBinding : HomeSeeAllCategoryBinding = HomeSeeAllCategoryBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val categories = arrayOf("American","Filipino","Italian","Japan","Mexican")
        val categoryAdapter : ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1,categories)

        viewBinding.recipeCategory.adapter = categoryAdapter;
        viewBinding.searchview.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {
                viewBinding.searchview.clearFocus()
                if(categories.contains(p0)){
                    categoryAdapter.filter.filter(p0)
                }
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                categoryAdapter.filter.filter(p0)
                return false
            }

        })
    }
}