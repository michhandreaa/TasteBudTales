
package com.mobdeve.basco.martinez.villanueva.irecipe.mco2

import android.graphics.Paint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.adapters.CategoryAdapter
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.adapters.HomeRecipeAdapter
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.HomeHomepageBinding
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.datahelpers.CategoryGenerator
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.datahelpers.HomeRecipeGenerator
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.models.CategoryModel
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.models.HomeRecipeModel

class HomePageActivity: AppCompatActivity() {
    private var isAllFabVisible : Boolean = false;
    private val categoryList : ArrayList<CategoryModel> = CategoryGenerator.loadCategory()
    private val homeRecipeList: ArrayList<HomeRecipeModel> = HomeRecipeGenerator.loadHomeRecipe()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding : HomeHomepageBinding = HomeHomepageBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.seeAllBtnRecipe.paintFlags = viewBinding.seeAllBtnRecipe.paintFlags or Paint.UNDERLINE_TEXT_FLAG
        viewBinding.seeAllBtnCategory.paintFlags = viewBinding.seeAllBtnCategory.paintFlags or Paint.UNDERLINE_TEXT_FLAG



        viewBinding.recyclerviewCategories.adapter = CategoryAdapter(categoryList)
        viewBinding.recyclerviewCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        viewBinding.recyclerviewRecipes.adapter = HomeRecipeAdapter(homeRecipeList)
        viewBinding.recyclerviewRecipes.layoutManager = GridLayoutManager(this, 2)



        viewBinding.fabAddIngredient.visibility = View.GONE
        viewBinding.fabAddRecipe.visibility = View.GONE
        viewBinding.addIngredientTV.visibility = View.GONE
        viewBinding.addRecipeTV.visibility = View.GONE

        viewBinding.fabParent.setOnClickListener(View.OnClickListener {
            if (!isAllFabVisible){
                viewBinding.fabParent.setImageResource(R.drawable.cross_icon)
                viewBinding.fabAddIngredient.visibility = View.VISIBLE
                viewBinding.fabAddRecipe.visibility = View.VISIBLE
                viewBinding.addIngredientTV.visibility = View.VISIBLE
                viewBinding.addRecipeTV.visibility = View.VISIBLE
                isAllFabVisible = true
            }else{
                viewBinding.fabParent.setImageResource(R.drawable.plus_icon)
                viewBinding.fabAddIngredient.visibility = View.GONE
                viewBinding.fabAddRecipe.visibility = View.GONE
                viewBinding.addIngredientTV.visibility = View.GONE
                viewBinding.addRecipeTV.visibility = View.GONE
                isAllFabVisible = false
            }
        })

            /*
        viewBinding.searchPageBtn.setOnClickListener{
            startActivity(Intent (this, SearchPageActivity::class.java))
        }

        viewBinding.profilePageBtn.setOnClickListener{
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        viewBinding.menuBtn.setOnClickListener{
            startActivity(Intent (this, SettingsActivity::class.java))
        }*/

    }

}
