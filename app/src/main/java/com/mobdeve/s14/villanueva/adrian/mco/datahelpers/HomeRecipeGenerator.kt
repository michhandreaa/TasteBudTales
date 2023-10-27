package com.mobdeve.s14.villanueva.adrian.mco.datahelpers

import com.mobdeve.s14.villanueva.adrian.mco.R
import com.mobdeve.s14.villanueva.adrian.mco.models.HomeRecipeModel

class HomeRecipeGenerator {
    companion object {
        fun loadHomeRecipe(): ArrayList<HomeRecipeModel> {
            val homeRecipe = ArrayList<HomeRecipeModel>()
            homeRecipe.add(HomeRecipeModel("Zucchini Slice", "3 zucchinis, grated\n" +
                    "1 onion, finely chopped\n" +
                    "1 cup of self-raising flour\n" +
                    "1/2 cup of vegetable oil\n" +
                    "5 eggs\n" +
                    "1 cup of grated cheddar cheese\n" +
                    "Salt and pepper to taste", R.drawable.zucchini_slice, "1. Preheat the oven to 180°C (356°F) and grease a 20 x 30 cm baking dish.\n" +
                    "2. In a large bowl, combine the grated zucchini, onion, self-raising flour, vegetable oil, eggs, and grated cheddar cheese.\n" +
                    "3. Mix well until all ingredients are combined.\n" +
                    "4. Add salt and pepper to taste and mix again.\n" +
                    "5. Pour the mixture into the greased baking dish and spread it out evenly.\n" +
                    "6. Bake in the preheated oven for 35-40 minutes or until golden brown on top and set in the middle.\n" +
                    "7. Once done, remove from the oven and let it cool for 5-10 minutes before slicing and serving.", 0, "Appetizer" ))

            homeRecipe.add(HomeRecipeModel("Vanilla Cardamom", "2 cups whole milk\n" +
                    "2 cups heavy cream\n" +
                    "3/4 cup granulated sugar\n" +
                    "1 vanilla bean, split and scraped\n" +
                    "1 teaspoon ground cardamom\n" +
                    "6 egg yolks", R.drawable.vanilla_cardamom_kulfi, "1. In a medium saucepan, combine the whole milk, heavy cream, sugar, vanilla bean, and cardamom. Heat over medium heat, stirring occasionally, until the mixture reaches a simmer.\n" +
                    "2. Remove the pan from heat and let it sit for 10-15 minutes to allow the flavors to meld.\n" +
                    "3. In a large bowl, whisk the egg yolks until smooth.\n" +
                    "4. Slowly pour the milk mixture into the bowl with the egg yolks, whisking constantly to temper the eggs.\n" +
                    "5. Pour the mixture back into the saucepan and return it to medium heat. Cook, stirring constantly, until the mixture thickens and coats the back of a spoon.\n" +
                    "6. Remove from heat and strain the mixture through a fine-mesh strainer to remove the vanilla bean and any bits of cooked egg.\n" +
                    "7. Let the mixture cool to room temperature, then transfer it to a container and chill in the refrigerator until it's completely cold.\n" +
                    "8. Once the mixture is chilled, churn it in an ice cream maker according to the manufacturer's instructions.\n" +
                    "9. Transfer the ice cream to a container and freeze until firm, at least 4 hours or overnight.\n" +
                    "10. Scoop and serve the vanilla cardamom ice cream, garnished with a sprinkle of ground cardamom if desired. Enjoy!\n", 9, "Dessert"))

            homeRecipe.add(HomeRecipeModel("Thai Beef Salad","1 pound beef sirloin, trimmed of excess fat\n" +
                    "1 tablespoon vegetable oil\n" +
                    "Salt and pepper\n" +
                    "3 tablespoons fresh lime juice\n" +
                    "1 tablespoon soy sauce\n" +
                    "1 tablespoon fish sauce\n" +
                    "2 teaspoons sugar\n" +
                    "1/2 teaspoon red pepper flakes\n" +
                    "2 cloves garlic, minced\n" +
                    "1/4 cup fresh mint leaves, torn\n" +
                    "1/4 cup fresh cilantro leaves, torn\n" +
                    "1/4 cup fresh basil leaves, torn\n" +
                    "1/4 cup sliced red onion\n" +
                    "1/2 cup sliced cucumber\n" +
                    "1/2 cup sliced cherry tomatoes\n" +
                    "Lettuce leaves, for serving" , R.drawable.thai_beef_salad,"1. In a large bowl, whisk together soy sauce, vegetable oil, brown sugar, fish sauce, lime juice, ginger, garlic, and red pepper flakes. Add beef strips and toss to coat. Cover and refrigerate for at least 30 minutes or up to 2 hours.\n" +
                    "2. Preheat grill or grill pan to high heat. Remove beef from marinade and discard remaining marinade.\n" +
                    "3. Grill beef strips for about 2 to 3 minutes per side or until cooked to desired doneness.\n" +
                    "4. In a large bowl, combine lettuce, cucumber, and red onion. Top with grilled beef strips and cilantro.\n" +
                    "5. Serve immediately." ,9, "Thai"))

            homeRecipe.add(HomeRecipeModel("Quiche", "175g plain flour\n" +
                    "100g cold butter, cut into small pieces\n" +
                    "1 egg yolk\n" +
                    "1-2 tbsp cold water\n" +
                    "6 rashers smoked streaky bacon, chopped\n" +
                    "3 eggs\n" +
                    "150ml double cream\n" +
                    "150ml milk\n" +
                    "salt and freshly ground black pepper", R.drawable.quiche, "1. To make the pastry, put the flour and butter in a food processor and pulse until the mixture resembles breadcrumbs. Add the egg yolk and water, then pulse again until the dough comes together. Wrap in cling film and chill for at least 30 mins.\n" +
                    "2. Heat a frying pan and cook the bacon for a few mins until crisp. Drain on kitchen paper.\n" +
                    "3. Heat oven to 200C/180C fan/gas 6. Roll out the pastry on a floured surface and use to line a 23cm loose-bottomed tart tin. Chill for 10 mins.\n" +
                    "4. Line the pastry with baking parchment and fill with baking beans. Bake for 15 mins, then remove the beans and parchment and cook for a further 10 mins until the base is pale golden and biscuity.\n" +
                    "5. Scatter the bacon over the base of the pastry case. Beat together the eggs, cream and milk, then season with salt (not too much) and pepper. Pour into the case and bake for about 25 mins until set and golden brown.", 9292,"French"))

            homeRecipe.add(
                HomeRecipeModel(
                    "Apple Pie", "Dough for double-crust pie\n" +
                            "1/3 cup sugar\n" +
                            "1/3 cup packed brown sugar\n" +
                            "1/4 cup all-purpose flour\n" +
                            "1 teaspoon ground cinnamon\n" +
                            "1/4 teaspoon ground ginger\n" +
                            "1/4 teaspoon ground nutmeg\n" +
                            "6 to 7 cups thinly sliced peeled tart apples\n" +
                            "1 tablespoon lemon juice\n" +
                            "1 tablespoon butter\n" +
                            "1 large egg white", R.drawable.pie, "1. Preheat oven to 375°. On a lightly floured surface, roll one half of dough to a 1/8-in.-thick circle; transfer to a 9-in. pie plate. Trim even with rim. In a large bowl, combine sugars, flour and spices; add apples and toss to coat.\n" +
                            "2. Fill crust with apple mixture; dot with butter. Roll remaining dough to a 1/8-in.-thick circle. Place over filling. Trim, seal and flute edge. Cut slits in top. Beat egg white until foamy; brush over crust. Sprinkle with sugar. Cover edge loosely with foil.\n" +
                            "3. Bake until crust is golden brown and filling is bubbly, 45-50 minutes. Remove foil. Bake until lattice is golden brown, 10-15 minutes longer. Cool on a wire rack.", 832, "Dessert"))

            homeRecipe.add(
                HomeRecipeModel(
                    "Fried Rice", "⅔ cup chopped baby carrots\n" +
                            "½ cup frozen green peas\n" +
                            "2 tablespoons vegetable oil\n" +
                            "1 clove garlic, minced, or to taste (Optional)\n" +
                            "2 large eggs\n" +
                            "3 cups leftover cooked white rice\n" +
                            "1 tablespoon soy sauce, or more to taste\n" +
                            "2 teaspoons sesame oil, or to taste", R.drawable.fried_rice, "1. Heat 1 tablespoon vegetable oil in a large skillet over medium heat. Add carrots and peas; cook and stir until vegetables are tender, about 5 minutes. Transfer vegetables to a bowl.\n" +
                            "2. Beat eggs in a bowl; pour into the same skillet. Cook and stir until eggs are set but still moist, about 3 minutes. Transfer eggs to the bowl with vegetables.\n" +
                            "3. Heat remaining 1 tablespoon vegetable oil in the same skillet over medium-high heat. Add garlic; cook and stir until fragrant, about 1 minute. Add rice; cook and stir until heated through, about 2 minutes.\n" +
                            "4. Stir vegetable-egg mixture into rice mixture; cook and stir until heated through, about 2 minutes. Add soy sauce and sesame oil; cook and stir until combined, about 1 minute.", 91212, "Chinese")
            )
            homeRecipe.add(
                HomeRecipeModel(
                    "Carbonara", "350g spaghetti\n" +
                            "6 rashers smoked streaky bacon, sliced into strips\n" +
                            "2 garlic cloves, peeled\n" +
                            "3 large eggs\n" +
                            "50g pecorino cheese, plus extra to serve\n"+
                            "black pepper", R.drawable.carbonara, "1. Bring a large pan of water to the boil, then add a pinch of salt and the spaghetti. Cook according to pack instructions until it is al dente.\n" +
                            "2. Meanwhile, heat a large frying pan over a medium heat. Add the bacon and fry for 8-10 mins until crisp. Squash in the garlic and fry for just 1 min more.\n" +
                            "3. Beat the eggs in a bowl with most of the cheese and plenty of black pepper.\n" +
                            "4. When the pasta is cooked, drain it, reserving a little of the cooking water. Add the pasta to the frying pan with the bacon and garlic and toss well over the heat so it’s coated with bacony goodness.\n" +
                            "5. Take off the heat and stir in the egg mixture – it’ll cook in the residual heat from the pasta. Thin it out with splashes of reserved cooking water until it’s silky smooth. Serve immediately with extra cheese and black pepper.", 1234, "Roman")
            )

            homeRecipe.add(
                HomeRecipeModel(
                    "Pumpkin Pie", "1 (15 ounce) can pumpkin puree\n" +
                            "1 (14 ounce) can EAGLE BRAND® Sweetened Condensed Milk\n" +
                            "2 large eggs\n" +
                            "1 teaspoon ground cinnamon\n" +
                            "1/2 teaspoon ground ginger\n" +
                            "1/2 teaspoon ground nutmeg\n" +
                            "1/2 teaspoon salt\n" +
                            "1 (9 inch) unbaked pie crust1 (15 ounce) can pumpkin puree\n" +
                            "1 (14 ounce) can EAGLE BRAND® Sweetened Condensed Milk\n" +
                            "2 large eggs\n" +
                            "1 teaspoon ground cinnamon\n" +
                            "1/2 teaspoon ground ginger\n" +
                            "1/2 teaspoon ground nutmeg\n" +
                            "1/2 teaspoon salt\n" +
                            "1 (9 inch) unbaked pie crust", R.drawable.pumpkin_soup, "1. Preheat oven to 425 degrees F (220 degrees C).\n" +
                            "2. Whisk pumpkin, sweetened condensed milk, eggs, spices and salt in medium bowl until smooth. Pour into crust. Bake 15 minutes.\n" +
                            "3. Reduce oven temperature to 350 degrees F (175 degrees C) and continue baking 35 to 40 minutes or until knife inserted 1 inch from crust comes out clean. Cool. Garnish as desired. Store leftovers covered in refrigerator.Preheat oven to 425 degrees F (220 degrees C).\n" +
                            "4. Whisk pumpkin, sweetened condensed milk, eggs, spices and salt in medium bowl until smooth. Pour into crust. Bake 15 minutes.\n" +
                            "5. Reduce oven temperature to 350 degrees F (175 degrees C) and continue baking 35 to 40 minutes or until knife inserted 1 inch from crust comes out clean. Cool. Garnish as desired. Store leftovers covered in refrigerator.", 12345, "Dessert")
            )

            homeRecipe.add(
                HomeRecipeModel(
                    "Lasagna", "½ pound ground pork\n" +
                            "½ pound lean ground beef\n" +
                            "½ cup minced onion\n" +
                            "1 (28 ounce) can crushed tomatoes\n" +
                            "1 (8 ounce) can tomato sauce\n" +
                            "2 tablespoons chopped fresh parsley, divided\n" +
                            "1 clove garlic, crushed\n" +
                            "1½ teaspoons dried basil\n" +
                            "1½ teaspoons salt\n" +
                            "½ teaspoon dried oregano\n" +
                            "⅛ teaspoon white sugar½ pound ground pork\n" +
                            "½ pound lean ground beef\n" +
                            "½ cup minced onion\n" +
                            "1 (28 ounce) can crushed tomatoes\n" +
                            "1 (8 ounce) can tomato sauce\n" +
                            "2 tablespoons chopped fresh parsley, divided\n" +
                            "1 clove garlic, crushed\n" +
                            "1½ teaspoons dried basil\n" +
                            "1½ teaspoons salt\n" +
                            "½ teaspoon dried oregano\n" +
                            "⅛ teaspoon white sugar", R.drawable.lasagne, "1. In a large skillet over high heat bring water to a boil.\n" +
                            "2. Add lasagna noodles and cook for about 8 minutes or until tender.\n" +
                            "3. Drain any excess water from skillet.\n" +
                            "4. Add mozzarella cheese, Parmesan cheese and ricotta cheese to skillet and stir well.\n" +
                            "5. Serve hot with fresh chopped basil or parsley.", 6734, "Main course")
            )
            homeRecipe.add(
                HomeRecipeModel("Beef Wellington", "1kg beef fillet\n" +
                        "salt and freshly ground black pepper\n" +
                        "2 tbsp olive oil\n" +
                        "250g chestnut mushroom, finely chopped\n" +
                        "50g butter\n" +
                        "1 large sprig fresh thyme, leaves only\n" +
                        "100ml dry white wine\n" +
                        "12 slices prosciutto\n" +
                        "500g puff pastry\n" +
                        "2 egg yolks, beaten", R.drawable.beef_wellington, "1.Season the beef with salt and pepper on all sides.\n" +
                        "2. Heat the oil and butter in a non-stick frying pan, when hot, add the beef and seal until browned on all sides. Remove from the pan and leave to cool.\n" +
                        "3. In the same pan, add the mushrooms and thyme and cook until all the moisture has disappeared. Add the wine and cook until it has reduced by half. Remove from the heat and leave to cool.\n" +
                        "4. Lay a sheet of cling film on a work surface and place overlapping slices of prosciutto on it in a double row.\n" +
                        "5. Spread half of the mushroom mixture over the prosciutto.\n" +
                        "6. Place the beef fillet on top and spread with the remaining mushroom mixture.\n" +
                        "7. Use the cling film to help roll the prosciutto around the beef into a tight barrel shape.\n" +
                        "8. Chill for at least 30 minutes.\n" +
                        "9. Preheat oven to 200C/180C fan/gas 6.\n" +
                        "10. Roll out the puff pastry on a floured surface to a size that will wrap around the beef fillet completely.\n" +
                        "11. Remove cling film from beef and place in centre of pastry.\n" +
                        "12.  Brush edges of pastry with beaten egg yolk then fold up to enclose beef completely.\n" +
                        "13. Place seam side down on baking sheet, brush with remaining egg yolk then bake for 40-45 minutes until pastry is golden brown.", 5879, "Main course")
            )

            homeRecipe.add(HomeRecipeModel("Spaghetti Bolognese", "•\t1 pound spaghetti\n" +
                    "•\t1 pound ground beef\n" +
                    "•\t1 onion, chopped\n" +
                    "•\t2 cloves garlic, minced\n" +
                    "•\t1 can diced tomatoes\n" +
                    "•\t1 can tomato sauce\n" +
                    "•\t1 teaspoon dried basil\n" +
                    "•\t1 teaspoon dried oregano\n" +
                    "•\tSalt and pepper, to taste \n", R.drawable.spaghettibolognese , "1.\tCook the spaghetti according to package instructions.\n" +
                    "2.\tMeanwhile, brown the ground beef in a large skillet over medium-high heat.\n" +
                    "3.\tAdd the onion and garlic to the skillet and cook until softened.\n" +
                    "4.\tStir in the diced tomatoes, tomato sauce, basil, and oregano.\n" +
                    "5.\tReduce heat and simmer for 10-15 minutes, stirring occasionally.\n" +
                    "6.\tSeason with salt and pepper to taste.\n" +
                    "7.\tServe the Bolognese sauce over the cooked spaghetti.\n", 122321, "Italian"))

            homeRecipe.add(HomeRecipeModel("Chicken Alfredo", "•\t1 pound fettuccine\n" +
                    "•\t2 chicken breasts, diced\n" +
                    "•\t2 tablespoons butter\n" +
                    "•\t2 cloves garlic, minced\n" +
                    "•\t1 cup heavy cream\n" +
                    "•\t1 cup grated Parmesan cheese\n" +
                    "•\tSalt and pepper, to taste \n", R.drawable.chicken_alfredo , "1.\tCook the fettuccine according to package instructions.\n" +
                    "2.\tMeanwhile, melt the butter in a large skillet over medium-high heat.\n" +
                    "3.\tAdd the diced chicken and garlic to the skillet and cook until the chicken is browned on all sides.\n" +
                    "4.\tReduce heat and stir in the heavy cream and Parmesan cheese.\n" +
                    "5.\tCook for 5-7 minutes, or until the sauce has thickened.\n" +
                    "6.\tSeason with salt and pepper to taste.\n" +
                    "7.\tServe the chicken Alfredo over the cooked fettuccine.\n", 324, "Italian"))

            homeRecipe.add(HomeRecipeModel("Classic Cheeseburger", "•\t1 pound ground beef\n" +
                    "•\t4 hamburger buns\n" +
                    "•\t4 slices American cheese\n" +
                    "•\t1/4 cup ketchup\n" +
                    "•\t1/4 cup mayonnaise\n" +
                    "•\t4 leaves lettuce\n" +
                    "•\t4 slices tomato\n" +
                    "•\tSalt and pepper, to taste \n", R.drawable.classiccheesburger , "1.\tPreheat grill or grill pan to medium-high heat.\n" +
                    "2.\tDivide the ground beef into 4 equal portions and form into patties.\n" +
                    "3.\tSeason the patties with salt and pepper on both sides.\n" +
                    "4.\tPlace the patties on the grill and cook for 3-4 minutes per side.\n" +
                    "5.\tToast the hamburger buns on the grill for 1-2 minutes.\n" +
                    "6.\tCombine the ketchup and mayonnaise in a small bowl to make the sauce.\n" +
                    "7.\tAssemble the burgers with the lettuce, tomato, cheese, and sauce.\n", 31578, "American"))

            homeRecipe.add(HomeRecipeModel("Margherita Pizza", "•\t1 pizza crust\n" +
                    "•\t1/2 cup tomato sauce\n" +
                    "•\t2 cloves garlic, minced\n" +
                    "•\t2 cups shredded mozzarella cheese\n" +
                    "•\t1/2 cup fresh basil leaves\n" +
                    "•\tSalt and pepper, to taste \n", R.drawable.margherita_pizza , "1.\tPreheat oven to 450°F.\n" +
                    "2.\tSpread the tomato sauce evenly over the pizza crust.\n" +
                    "3.\tSprinkle the minced garlic over the sauce.\n" +
                    "4.\tCover the sauce with shredded mozzarella cheese.\n" +
                    "5.\tSeason with salt and pepper to taste.\n" +
                    "6.\tBake in preheated oven for 10-12 minutes, or until the cheese is melted and bubbly.\n" +
                    "7.\tTop with fresh basil leaves and slice to serve.\n", 899234, "Italian"))

            homeRecipe.add(HomeRecipeModel("Beef Stew", "•\t2 pounds beef chuck, cut into 1inch cubes\n" +
                    "•\t2 tablespoons olive oil\n" +
                    "•\t1 onion, chopped\n" +
                    "•\t2 cloves garlic, minced\n" +
                    "•\t4 carrots, peeled and sliced\n" +
                    "•\t4 celery stalks, sliced\n" +
                    "•\t2 potatoes, peeled and cubed\n" +
                    "•\t4 cups beef broth\n" +
                    "•\t1 tablespoon tomato paste\n" +
                    "•\t1 teaspoon dried thyme\n" +
                    "•\tSalt and pepper, to taste \n", R.drawable.beef_stew , "1.\tHeat olive oil in a large pot over medium-high heat.\n" +
                    "2.\tAdd the beef and brown on all sides.\n" +
                    "3.\tAdd the onion and garlic to the pot and cook until softened.\n" +
                    "4.\tAdd the carrots, celery, and potatoes to the pot and stir to combine.\n" +
                    "5.\tPour in the beef broth and stir in the tomato paste and thyme.\n" +
                    "6.\tSeason with salt and pepper to taste.\n" +
                    "7.\tBring to a boil, then reduce heat and simmer for 1-2 hours, or until the beef is tender and the vegetables are cooked through.\n", 8123, "Comfort food"))

            homeRecipe.add(HomeRecipeModel("Chicken Tikka Masala", "•\t1 pound boneless, skinless chicken breasts, cut into bite-sized pieces\n" +
                    "•\t1/2 cup plain yogurt\n" +
                    "•\t1/4 cup heavy cream\n" +
                    "•\t1 tablespoon grated ginger\n" +
                    "•\t2 cloves garlic, minced\n" +
                    "•\t2 teaspoons garam masala\n" +
                    "•\t1 teaspoon paprika\n" +
                    "•\t1/2 teaspoon ground turmeric\n" +
                    "•\tSalt and pepper, to taste\n" +
                    "•\t2 tablespoons vegetable oil\n" +
                    "•\t1 onion, chopped\n" +
                    "•\t1 can diced tomatoes\n" +
                    "•\t1/2 cup chicken broth\n" +
                    "•\t1/4 cup chopped fresh cilantro \n", R.drawable.chicken_tikka_masala , "1.\tIn a large bowl, combine the chicken, yogurt, heavy cream, ginger, garlic, garam masala, paprika, turmeric, salt, and pepper. Stir until the chicken is coated with the marinade.\n" +
                    "2.\tCover and refrigerate for at least 1 hour, or overnight.\n" +
                    "3.\tHeat the oil in a large skillet over medium-high heat.\n" +
                    "4.\tAdd the onion to the skillet and cook until softened.\n" +
                    "5.\tAdd the marinated chicken to the skillet and cook until browned on all sides.\n" +
                    "6.\tStir in the diced tomatoes and chicken broth.\n" +
                    "7.\tReduce heat and simmer for 15-20 minutes, or until the chicken is cooked through and the sauce has thickened.\n" +
                    "8.\tStir in the cilantro and serve over rice.\n", 8123, "Indian"))

            homeRecipe.add(HomeRecipeModel("Classic Lasagna", "•\t1 pound lasagna noodles\n" +
                    "•\t1 pound ground beef\n" +
                    "•\t1 onion, chopped\n" +
                    "•\t2 cloves garlic, minced\n" +
                    "•\t1 can tomato sauce\n" +
                    "•\t1 can diced tomatoes\n" +
                    "•\t1 teaspoon dried basil\n" +
                    "•\t1 teaspoon dried oregano\n" +
                    "•\tSalt and pepper, to taste\n" +
                    "•\t2 cups ricotta cheese\n" +
                    "•\t1 cup grated Parmesan cheese\n" +
                    "•\t2 cups shredded mozzarella cheese\n", R.drawable.classic_lasagna , "1.\tCook the lasagna noodles according to package instructions.\n" +
                    "2.\tMeanwhile, brown the ground beef in a large skillet over medium-high heat.\n" +
                    "3.\tAdd the onion and garlic to the skillet and cook until softened.\n" +
                    "4.\tStir in the tomato sauce, diced tomatoes, basil, and oregano.\n" +
                    "5.\tReduce heat and simmer for 10-15 minutes, stirring occasionally.\n" +
                    "6.\tSeason with salt and pepper to taste.\n" +
                    "7.\tPreheat oven to 375°F.\n" +
                    "8.\tIn a separate bowl, combine the ricotta cheese and Parmesan cheese.\n" +
                    "9.\tSpread a layer of the meat sauce in the bottom of a 9x13 inch baking dish.\n" +
                    "10.\tAdd a layer of cooked lasagna noodles on top of the meat sauce. \n" +
                    "11.\t11. Spread a layer of the ricotta cheese mixture over the noodles.\n" +
                    "12.\tSprinkle a layer of shredded mozzarella cheese over the ricotta cheese mixture.\n" +
                    "13.\tRepeat layers until all ingredients are used, ending with a layer of meat sauce and shredded mozzarella cheese on top.\n" +
                    "14.\tCover the baking dish with aluminum foil and bake in the preheated oven for 25 minutes.\n" +
                    "15.\tRemove the foil and bake for an additional 25 minutes, or until the cheese is melted and bubbly.\n" +
                    "16.\tLet the lasagna cool for a few minutes before slicing and serving.\n", 6723, "Italian"))

            homeRecipe.add(HomeRecipeModel("Baked Ziti", "1 pound ziti pasta\n" +
                    "1 pound ground beef\n" +
                    "1/2 cup chopped onion\n" +
                    "2 cloves garlic, minced\n" +
                    "24 ounces jarred marinara sauce\n" +
                    "1 cup ricotta cheese\n" +
                    "1 cup shredded mozzarella cheese\n" +
                    "1/4 cup grated Parmesan cheese\n" +
                    "Salt and pepper, to taste", R.drawable.baked_ziti , "Preheat the oven to 375°F.\n" +
                    "Cook the ziti pasta according to the package instructions. Drain and set aside.\n" +
                    "In a large skillet, cook the ground beef over medium-high heat until browned and cooked through, about 5-7 minutes.\n" +
                    "Add the chopped onion and minced garlic to the skillet and cook until the onion is softened, about 2-3 minutes.\n" +
                    "Add the jarred marinara sauce to the skillet and stir to combine.\n" +
                    "In a large bowl, combine the cooked ziti pasta, the beef and sauce mixture, and the ricotta cheese. Stir to combine.\n" +
                    "Transfer the ziti mixture", 83224, "Main Dish"))

            homeRecipe.add(HomeRecipeModel("Beef and Broccoli Stir-Fry", "•\t1 pound flank steak, thinly sliced against the grain\n" +
                    "•\t1/4 cup soy sauce2 tablespoons cornstarch\n" +
                    "•\t1/4 teaspoon black pepper\n" +
                    "•\t3 tablespoons vegetable oil, divided\n" +
                    "•\t2 cloves garlic, minced\n" +
                    "•\t1/2 teaspoon grated ginger\n" +
                    "•\t1/2 cup beef broth\n" +
                    "•\t2 tablespoons oyster sauce\n" +
                    "•\t2 tablespoons hoisin sauce\n" +
                    "•\t2 tablespoons brown sugar\n" +
                    "•\t1/4 teaspoon red pepper flakes\n" +
                    "•\t4 cups broccoli florets\n" +
                    "•\tCooked white rice, for serving \n", R.drawable.beef_and_broccoli , "1.\tIn a medium bowl, whisk together the soy sauce, cornstarch, and black pepper.\n" +
                    "2.\tAdd the sliced flank steak to the bowl and toss to coat in the marinade. Let sit for 10-15 minutes.\n" +
                    "3.\tHeat 2 tablespoons of the vegetable oil in a large skillet or wok over high heat.\n" +
                    "4.\tAdd the marinated flank steak to the skillet and cook until browned and cooked through, about 2-3 minutes. Remove from the skillet and set aside.\n" +
                    "5.\tHeat the remaining tablespoon of vegetable oil in the skillet over high heat.\n" +
                    "6.\tAdd the minced garlic and grated ginger to the skillet and cook until fragrant, about 1 minute.\n" +
                    "7.\tAdd the beef broth, oyster sauce, hoisin sauce, brown sugar, and red pepper flakes to the skillet and stir to combine.\n" +
                    "8.\tAdd the broccoli florets to the skillet and stir to coat in the sauce.\n" +
                    "9.\tCover the skillet and cook for 3-5 minutes, or until the broccoli is tender-crisp.\n" +
                    "10.\tReturn the cooked flank steak to the skillet and toss to combine with the broccoli and sauce.\n" +
                    "11.\tServe hot with cooked white rice.\n", 83224, "Chinese"))

            homeRecipe.add(
                HomeRecipeModel("Pad Thai", "•\t8 ounces rice noodles\n" +
                    "•\t2 tablespoons vegetable oil\n" +
                    "•\t2 cloves garlic, minced\n" +
                    "•\t1/2 pound peeled and deveined shrimp\n" +
                    "•\t2 eggs, beaten\n" +
                    "•\t1/4 cup chopped peanuts\n" +
                    "•\t1/4 cup chopped fresh cilantro\n" +
                    "•\t1/4 cup chopped green onions\n" +
                    "•\t1/4 cup fish sauce\n" +
                    "•\t2 tablespoons tamarind paste\n" +
                    "•\t2 tablespoons sugar\n" +
                    "•\t1 tablespoon soy sauce\n" +
                    "•\t1/4 teaspoon red pepper flakes \n", R.drawable.pad_thaii , "1.\tSoak the rice noodles in warm water for 20-30 minutes or until softened. Drain and set aside.\n" +
                    "2.\tHeat the vegetable oil in a large skillet or wok over high heat.\n" +
                    "3.\tAdd the minced garlic to the skillet and cook until fragrant, about 1 minute.\n" +
                    "4.\tAdd the shrimp to the skillet and cook until pink and cooked through, about 2-3 minutes.\n" +
                    "5.\tPush the shrimp to one side of the skillet and pour the beaten eggs into the other side of the skillet.\n" +
                    "6.\tScramble the eggs until cooked, then stir in the shrimp and garlic.\n" +
                    "7.\tAdd the cooked rice noodles to the skillet and toss to combine with the shrimp and egg mixture.\n" +
                    "8.\tAdd the chopped peanuts, cilantro, and green onions to the skillet and toss to combine.\n" +
                    "9.\tIn a separate bowl, whisk together the fish sauce, tamarind paste, sugar, soy sauce, and red pepper flakes.\n" +
                    "10.\tPour the sauce over the noodle mixture and toss to combine.\n" +
                    "11.\tServe hot.\n", 83224, "Thai")
            )
            return homeRecipe
        }
    }

}
