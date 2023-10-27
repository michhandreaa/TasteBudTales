package com.mobdeve.s14.villanueva.adrian.mco.models

class HomeRecipeModel {
    var recipeName: String = ""
    var recipeIngredients: String = ""
    var recipeImage: Int = 0
    var recipeInstructions: String = ""
    var recipeLikes: Int = 0
    var recipeCategory: String = ""
    var username: String = ""
    var imageUri: String = ""


    constructor(recipeName: String, recipeIngredients: String, recipeImage: Int, recipeInstructions: String, recipeLikes: Int, recipeCategory: String) {
        this.recipeName = recipeName
        this.recipeIngredients = recipeIngredients
        this.recipeImage = recipeImage
        this.recipeInstructions = recipeInstructions
        this.recipeLikes = recipeLikes
        this.recipeCategory = recipeCategory
    }

    constructor(username: String, recipeName: String, recipeIngredients: String, recipeInstructions: String, recipeCategory: String, imageUri: String) {
        this.username = username
        this.recipeName = recipeName
        this.recipeIngredients = recipeIngredients
        this.recipeInstructions = recipeInstructions
        this.recipeCategory = recipeCategory
        this.imageUri = imageUri
    }

}
