package com.mobdeve.basco.martinez.villanueva.irecipe.mco2

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.adapters.ProfileAdapter
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.adapters.RecipeAdapter
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.datahelpers.ProfileGenerator
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.datahelpers.RecipeGenerator
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.models.ProfileModel
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.models.RecipeModel


class SearchPageActivity : AppCompatActivity() {

    private val recipeList: ArrayList<RecipeModel> = RecipeGenerator.loadRecipe()
    private val profileList: ArrayList<ProfileModel> = ProfileGenerator.loadProfile()

    private lateinit var recipeRecyclerView: RecyclerView
    private lateinit var profileRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_main)

        /* RecyclerView initialization, setting Adapter, and setting LayoutManager
            for Popular Recipe Searches */
        recipeRecyclerView = findViewById(R.id.recipeRecyclerView)
        recipeRecyclerView.adapter = RecipeAdapter(recipeList)
        recipeRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        /* RecyclerView initialization, setting Adapter, and setting LayoutManager
            for Popular Profile Searches */
        profileRecyclerView = findViewById(R.id.profileRecyclerView)
        profileRecyclerView.adapter = ProfileAdapter(profileList)
        profileRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        /* AutoCompleteTextView Drop Down */
        val autoCompleteTextView: AutoCompleteTextView = findViewById(R.id.input_search_bar)
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, resources.getStringArray(R.array.profile_recipe))
        autoCompleteTextView.setAdapter(arrayAdapter)

        /* Navigation Bar Intents */
        val homepageButton : ImageView = findViewById(R.id.homePageBtn)
        val profileButton : ImageView = findViewById(R.id.profilePageBtn)
        homepageButton.setOnClickListener{
            startActivity(Intent(this, HomepageActivity::class.java))
            finish()
        }
        profileButton.setOnClickListener{
            startActivity(Intent (this, ProfileActivity::class.java))
            finish()
        }
    }
}