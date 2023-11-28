package com.mobdeve.bascomartinezvillanueva.tastebudtales

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databaseHelpers.RecipeAdapter
import com.mobdeve.bascomartinezvillanueva.tastebudtales.databinding.HomeHomepageBinding
import com.mobdeve.bascomartinezvillanueva.tastebudtales.models.Recipe
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HomeActivity : AppCompatActivity() {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.spoonacular.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val service = retrofit.create(SpoonacularService::class.java)

    private lateinit var viewBinding: HomeHomepageBinding
    private lateinit var recipeAdapter: RecipeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = HomeHomepageBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)


        // initialize recyclerView
        recipeAdapter = RecipeAdapter(ArrayList())
        viewBinding.recipesRecyclerView.adapter = recipeAdapter
        viewBinding.recipesRecyclerView.layoutManager = LinearLayoutManager(this)

        viewBinding.appetizerBtn.setOnClickListener {
            startFilteredCategoryActivity("appetizer")
        }
        viewBinding.maincourseBtn.setOnClickListener {
            startFilteredCategoryActivity("maincourse")
        }
        viewBinding.dessertBtn.setOnClickListener {
            startFilteredCategoryActivity("dessert")
        }


        CoroutineScope(Dispatchers.Main).launch {
            try {
                val response = service.getRandomRecipes("appetizer,maincourse,dessert", 6,  "ea3591ae88e543be9dca08f87a360caa")
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


    private fun startFilteredCategoryActivity(category: String) {
        val intent = Intent(this, FilteredCategoryActivity::class.java)
        intent.putExtra(IntentKeys.CATEGORY_KEY, category)
        startActivity(intent)
    }
}