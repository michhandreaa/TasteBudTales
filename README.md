# TasteBudTales

## Description 
This application is crafted with the aim of assisting in meal creation. It leverages the capabilities of Rapid API, enabling users to enter a list of available food items in their pantry and discover various recipes they can whip up with those ingredients. This feature aids users in exploring diverse cooking options based on their current pantry stock. Users can log in, fill out a form with potential ingredients, and upon submission, the application presents a variety of recipes to choose from. Additionally, the menu includes a feature that allows users to view their past recipe selections. Each recipe in this history comes with a feedback button, enabling users to share their cooking results.

## Services / APIs 
1. Database (SQLite)
- To store/verify user credentials and reviews
2. Rapid API (https://rapidapi.com/spoonacular/api/recipe-food-nutrition)
- Access ingredients and recipes from Spoonacular Recipe - Food - Nutrition 
3. Camera
- Pictures taken by the user for reviews or for posting 

## Functions
1. Register
- The user must first register an account before accessing the other features of the app. Users are required to give their full name, birthday, email, and password.
2. Log-in
- The user must log in before searching for recipes. This requires the user to enter their registered email and a password.
3. Input Ingredients
- The user can input a list of ingredients.
4. View Recipes
- Once a user inputs their ingredients, the app will provide a list of recipes they can cook given the submitted ingredients.
6. Create Recipes Review
- Users can create their own recipes to share with other people. Users can create a review of the recipe that they made and even take photos of the dish.
7. Review Notification
- The app will notify the user if someone created a review on their recipe.
