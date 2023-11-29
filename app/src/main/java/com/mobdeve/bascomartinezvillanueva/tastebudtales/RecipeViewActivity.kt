package com.mobdeve.bascomartinezvillanueva.tastebudtales

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databaseHelpers.SpoonacularServiceSingleton
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databinding.RecipeViewBinding
import com.mobdeve.bascomartinezvillanueva.tastebudtales.models.Recipe
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.HttpException

// In RecipeViewActivity
class RecipeViewActivity : AppCompatActivity() {

    private lateinit var viewBinding: RecipeViewBinding
    private val apiService: SpoonacularService by lazy {
        SpoonacularServiceSingleton.getService()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = RecipeViewBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        // Extract recipe ID from the intent
        val recipeId = intent.getIntExtra(IntentKeys.RECIPE_ID, -1)

// Check if a valid recipe ID is provided
        if (recipeId != -1) {
            // Make a network request to get the recipe details
            CoroutineScope(Dispatchers.Main).launch {
                try {
                    val response = apiService.viewRecipeById(id = recipeId, "ea3591ae88e543be9dca08f87a360caa")

                    if (response.isSuccessful) {
                        val recipe = response.body()
                        if (recipe != null) {
                            // Handle the single recipe
                            displayRecipeDetails(recipe)
                        } else {
                            Log.e("API_ERROR", "Response body is null.")
                        }
                    } else {
                        Log.e("API_ERROR", "Response not successful: ${response.code()}")
                        val responseBody = response.body()
                        if (responseBody != null) {
                            Log.e("API_ERROR", "Error body: $responseBody")
                        } else {
                            Log.e("API_ERROR", "Error body is null.")
                        }
                    }
                } catch (e: Exception) {
                    Log.e("API_ERROR", "Error: ${e.message}")
                    if (e is HttpException) {
                        Log.e("API_ERROR", "HTTP error code: ${e.code()}")
                        Log.e("API_ERROR", "HTTP error message: ${e.message()}")
                    }
                }
            }
        } else {
            // Handle the case where no valid recipe ID is provided
        }

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

    // Other methods, such as displayRecipeDetails, can remain the same...

    private fun displayRecipeDetails(recipe: Recipe) {
        // Load recipe image using Glide
        Glide.with(this)
            .load(recipe.image)
            .placeholder(R.drawable.food_sample)
            .error(R.drawable.broken_image)
            .into(viewBinding.ivRecipeImage)

        // Set recipe name
        viewBinding.tvRecipename.text = recipe.title

        // Set recipe category or any other details you want to display
        viewBinding.tvRecipeLikes.text = "Category: " + recipe.dishTypes.joinToString(", ")

        // Set aggregate likes
        viewBinding.tvRecipeCategory.text = "Likes: ${recipe.aggregateLikes}"

        // Set list of ingredients
        val ingredients = recipe.extendedIngredients.map { it.name }.joinToString("\n")
        viewBinding.listOfIngredients.text = ingredients

        // Set list of instructions
        viewBinding.listInstructions.text = recipe.instructions
    }
}
