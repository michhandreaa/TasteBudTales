package com.mobdeve.basco.martinez.villanueva.irecipe.mco2

import android.content.Intent
import android.graphics.Paint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.HomeHomepageBinding

class HomepageActivity : AppCompatActivity (){

    private var isAllFabVisible : Boolean = false;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding : HomeHomepageBinding = HomeHomepageBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.seeAllBtnRecipe.paintFlags = viewBinding.seeAllBtnRecipe.paintFlags or Paint.UNDERLINE_TEXT_FLAG
        viewBinding.seeAllBtnCategory.paintFlags = viewBinding.seeAllBtnCategory.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        viewBinding.fabAddRecipe.setOnClickListener{
            startActivity(Intent(this, AddRecipeActivity::class.java))
        }

        viewBinding.fabAddIngredient.setOnClickListener {
            startActivity(Intent(this, AddIngredientActivity::class.java))
        }

        viewBinding.seeAllBtnCategory.setOnClickListener{
            startActivity(Intent(this, SeeAllRecipeCategoryActivity::class.java))
        }

        viewBinding.seeAllBtnRecipe.setOnClickListener{
            startActivity(Intent(this, SeeAllRecipeActivity::class.java))
        }

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

        viewBinding.searchBtn.setOnClickListener{
            startActivity(Intent (this, SearchPageActivity::class.java))
        }

        viewBinding.profileBtn.setOnClickListener{
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        viewBinding.menuBtn.setOnClickListener{
            startActivity(Intent (this, SettingsActivity::class.java))
        }
    }
}