# iRecipe

## Description 
This application is designed for food preparation. It makes use of Rapid API which allows its users to input a list of food essentials they currently have at home to determine the different recipes that they could make out of the available ingredients. This will help users think of different options of what they could cook out of what they currently have at home. The user is allowed to log in, and input their possible ingredients in a form then once submitted, the application will display the different recipes to select. Through the menu, there is also an option where the users have a history of their previously selected recipes, there will be a button right beside each recipe to give feedback on their cooking outcomes. 

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
