package com.mobdeve.s14.villanueva.adrian.mco

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import com.mobdeve.s14.villanueva.adrian.mco.databinding.RecipeViewBinding

class RecipeViewActivity : AppCompatActivity()  {
    private var liked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding: RecipeViewBinding = RecipeViewBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val intent = intent

        viewBinding.ivRecipeImage.setImageResource(intent.getIntExtra(IntentKeys.RECIPE_IMAGE, 0))
        viewBinding.tvRecipename.text = intent.getStringExtra(IntentKeys.RECIPE_NAME)
        viewBinding.tvRecipeCategory.text = intent.getStringExtra(IntentKeys.RECIPE_CATEGORY)
        viewBinding.listOfIngredients.text = intent.getStringExtra(IntentKeys.RECIPE_INGREDIENTS)
            ?.replace("[", "")
            ?.replace("]", "")
            ?.split(", ")
            ?.joinToString("\n")

        viewBinding.listInstructions.text = intent.getStringExtra(IntentKeys.RECIPE_INSTRUCTIONS)
            ?.replace("[", "")
            ?.replace("]", "")
            ?.split(",")
            ?.map { it.trim() }
            ?.joinToString("\n")

        viewBinding.likeBtn.setOnClickListener {
            if (liked) {
                viewBinding.likeBtn.setImageResource(R.drawable.hollowheart)
                liked = false

                val currentLikes = viewBinding.tvRecipeLikes.text.toString().split(" ")[0].toInt()
                val newLikes = currentLikes - 1
                if (newLikes <= 0) {
                    viewBinding.tvRecipeLikes.text = "0 Likes"
                } else {
                    viewBinding.tvRecipeLikes.text = "$newLikes Likes"
                }
            } else {
                viewBinding.likeBtn.setImageResource(R.drawable.redheart)
                liked = true

                val currentLikes = viewBinding.tvRecipeLikes.text.toString().split(" ")[0].toInt()
                val newLikes = currentLikes + 1
                viewBinding.tvRecipeLikes.text = "$newLikes Likes"
            }
        }
        }
    }


