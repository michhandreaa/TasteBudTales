package com.mobdeve.bascomartinezvillanueva.tastebudtales

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databinding.HomeSeeAllPerCategoriesRecipesBinding
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databaseHelpers.RecipeAdapter
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databaseHelpers.SpoonacularServiceSingleton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FilteredCategoryActivity : AppCompatActivity() {
    // List to hold home recipe data
    private lateinit var category: String
    private lateinit var recipeAdapter: RecipeAdapter // Add this line

    private lateinit var viewBinding: HomeSeeAllPerCategoriesRecipesBinding

    private val service: SpoonacularService by lazy {
        SpoonacularServiceSingleton.getService()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = HomeSeeAllPerCategoriesRecipesBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)  // Set the content view to the inflated viewBinding.root


        category = intent.getStringExtra(IntentKeys.CATEGORY_KEY) ?: ""

        // Set the category name in the UI
        viewBinding.tvCategoryName.text = category

        recipeAdapter = RecipeAdapter(ArrayList()) // Add this line
        viewBinding.recipesRecyclerView.layoutManager = LinearLayoutManager(this)
        viewBinding.recipesRecyclerView.adapter = recipeAdapter

        // Fetch and display recipes for the selected category
        fetchAndDisplayRecipes()

        viewBinding.homeBtn.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        viewBinding.searchBtn.setOnClickListener {
            startActivity(Intent(this, SearchPageActivity::class.java))
        }

        viewBinding.profileBtn.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }

    private fun fetchAndDisplayRecipes() {
        CoroutineScope(Dispatchers.Main).launch {
            try {
                val response = service.getRandomRecipes(tags = category, 20,  "ea3591ae88e543be9dca08f87a360caa")
                if (response.isSuccessful) {
                    Log.d("API_RESPONSE", "API call successful")

                    val recipes = response.body()?.recipes
                    if (recipes != null && recipes.isNotEmpty()) {
                        Log.d("API_RESPONSE", "Recipes: $recipes")
                        recipeAdapter.updateRecipes(recipes)
                    }
                } else {
                    Log.e("API_ERROR", "Response not successful: ${response.message()}")
                }
            } catch (e: Exception) {
                Log.e("API_ERROR", "Error: ${e.message}")
            }
        }
    }

}
