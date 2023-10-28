package com.mobdeve.basco.martinez.villanueva.irecipe.mco2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.HomeAddIngredientPageBinding


class AddIngredientActivity : AppCompatActivity() {
    private lateinit var recyclerView : RecyclerView
    //private lateinit var ingredientAdapter : IngredientAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding : HomeAddIngredientPageBinding = HomeAddIngredientPageBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.addIngredientBtn.setOnClickListener(View.OnClickListener {
            startActivity(Intent (this, AddIngredientFormActivity::class.java))
        })

        viewBinding.saveBtn.setOnClickListener{
            finish()
        }
    }
}