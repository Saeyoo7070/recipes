package com.example.recipebox;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;
    Spinner categorySpinner;
    List<Recipes>  recipes;
    List<Recipes> allRecipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        allRecipes = new ArrayList<>();
        allRecipes.add(new Recipes(
                "Chicken Adobo",
                "• 2 lbs chicken \n" +
                "• 3 pieces dried bay leaves \n" +
                "• 4 tablespoons soy sauce \n" +
                "• 6 tablespoons white vinegar \n" +
                "• 5 cloves garlic\n" +
                "• 1 1/2 cups water\n" +
                "• 3 tablespoons cooking oil\n" +
                "• 1 teaspoon sugar \n" +
                "• 1/4 teaspoon salt\n" +
                "• 1 teaspoon whole peppercorn",
                "Method",
                "1. Combine chicken, soy sauce, and garlic in a large bowl. Mix well. Marinate the chicken for at least 1 hour. Note: the longer the time, the better (2 lbs chicken, 4 tablespoons soy sauce)\n\n" +
                "2. Heat a cooking pot. Pour cooking oil. (3 tablespoons cooking oil)\n\n" +
                "3. When the oil is hot enough, pan-fry the marinated chicken for 2 minutes per side.\n\n" +
                "4. Pour-in the remaining marinade, including garlic. Add water. Bring to a boil (1 1/2 cups water)\n\n" +
                "5. Add dried bay leaves and whole peppercorn. Simmer for 30 minutes or until the chicken gets tender (3 pieces dried bay leaves, 1 teaspoon whole peppercorn)\n\n" +
                "6. Add vinegar. Stir and cook for 10 minutes. (6 tablespoons white vinegar)\n\n" +
                "7. Put-in the sugar, and salt. Stir and turn the heat off.Serve hot. (1 teaspoon sugar, 1/4 teaspoon salt)\n\n" +
                "Share and Enjoy!",R.drawable.adobo_chicken,
                "Main"
                ));

        allRecipes.add(new Recipes(
                "Strawberry Cake",
                "Cake:\n\n" + "• 2 and 1/2 cups (285g) cake flour (spooned & leveled)\n" +
                        "• 2 teaspoons baking powder\n" +
                        "• 1/2 teaspoon baking soda\n" +
                        "• 1 teaspoon salt\n" + "• 3/4 cup (12 Tbsp; 170g) unsalted butter, softened to room temperature\n" + "• 1 and 3/4 cups (350g) granulated sugar\n" +
                        "• 5 large egg whites, at room temperature\n" +
                        "• 1/3 cup (75g) sour cream or plain yogurt, at room temperature\n" +
                        "• 2 teaspoons pure vanilla extract\n" +
                        "• 1/2 cup (120ml) whole milk, at room temperature*\n" +
                        "• 1/2 cup reduced strawberry puree (see step 1)\n" +
                        "• optional: 1–2 drops red or pink food coloring\n" + "\n" + "Strawberry Cream Cheese Frosting:\n\n" + "• 1 cup (about 25g) freeze-dried strawberries*\n" +
                        "8 ounces (226g) full-fat brick cream cheese, softened to room temperature\n" +
                        "• 1/2 cup (8 Tbsp; 113g) unsalted butter, softened to room temperature\n" +
                        "• 3 cups (360g) confectioners’ sugar\n" + "• 1–2 Tablespoons milk\n" +
                        "• 1 teaspoon pure vanilla extract\n" +
                        "• salt, to taste",
                "Method",
                "1. Make the reduced strawberry puree first, and let cool: Puree 1 pound of rinsed and hulled strawberries. You should have a little over 1 cup. Stirring occasionally, simmer the puree over medium-low heat until you’re left with 1/2 cup (about 135g) or slightly more (you need 1/2 cup for the cake). This takes at least 25–35 minutes, but could take longer depending on your pan or how juicy your strawberries were. Allow to cool completely before using in cake batter. I always make the reduced puree the day before so it has plenty of time to cool down. I cover and place in the refrigerator overnight. Allow it to come back to room temperature before adding to the cake batter.\n\n" +
                        "2. Preheat oven to 350°F (177°C). Grease two 9-inch round cake pans, line with parchment paper rounds, then grease the parchment paper. Parchment paper helps the cakes seamlessly release from the pans.\n\n" +
                        "3. Make the cake: Whisk the cake flour, baking powder, baking soda, and salt together. Set aside.\n\n" +
                        "4. Using a handheld or stand mixer fitted with a paddle attachment, beat the butter and sugar together on high speed until smooth and creamed, about 2 minutes. Scrape down the sides and up the bottom of the bowl with a silicone spatula as needed. Beat in the egg whites on high speed until combined, about 2 minutes. Then beat in the sour cream and vanilla extract. Scrape down the sides and up the bottom of the bowl as needed. With the mixer on low speed, add the dry ingredients until just incorporated. With the mixer still running on low, slowly pour in the milk *just* until combined. Do not overmix. Whisk in 1/2 cup of room-temperature reduced strawberry puree, making sure there are no lumps at the bottom of the bowl. The batter will be slightly thick. Stir in food coloring, if desired. (I use 1 small drop of pink gel food coloring.)\n\n" +
                        "5. Pour batter evenly into cake pans. Bake for around 24–25 minutes or until the cakes are baked through. To test for doneness, insert a toothpick into the center of the cake. If it comes out clean, it is done. Allow cakes to cool completely in the pans set on a wire rack. The cakes must be completely cool before frosting and assembling.\n\n" +
                        "6. Make the frosting: Using a blender or food processor, process the freeze-dried strawberries into a powdery crumb. You should have around 1/2 cup crumbs. Set aside. In a large bowl using a handheld or stand mixer fitted with a paddle or whisk attachment, beat the cream cheese for 1 minute on high speed until completely smooth and creamy. Beat in the butter until combined. Add the confectioners’ sugar, strawberry powder, 1 Tablespoon milk, and vanilla and beat on medium-high speed until combined and creamy. Add 1 more Tablespoon of milk to slightly thin out, if desired. Taste, then add a pinch of salt if needed. Yields about 3 cups of frosting.\n\n" +
                        "7. Assemble and frost: First, using a large serrated knife, slice a thin layer off the tops of the cakes to create a flat surface. Discard (or crumble over ice cream!). Place 1 cake layer on your cake stand, cake turntable, or serving plate. Evenly cover the top with frosting. Top with 2nd layer and spread the remaining frosting all over the top and sides. Refrigerate for at least 45 minutes before slicing. This helps the cake keep its shape when cutting—it could slightly fall apart without time in the fridge.\n\n" +
                        "8. Cover leftover cake tightly and store in the refrigerator for 5 days.\n\n" +
                        "Enjoy!",R.drawable.strawberry_cake,
                "Dessert"
        ));

        allRecipes.add(new Recipes(
                "Iced Tea",
                "• Black tea bags (it’s fine to use decaf black tea or even herbal tea if you don’t want the caffeine)\n" +
                "• Cold water\n" + "Optional iced tea add-ins:\n\n" +
                "• Sugar or other sweetener (optional)\n" +
                "• Fresh herbs, like mint, thyme or lemon verbena\n" +
                "• Lemon slices (optional)",
                "Method",
                "1. Boil water. Grab your favorite pot and boil some water.\n\n" +
                "2. Steep! Off the heat, add the tea bags. 4 minutes is probably long enough. If you want a stronger tea, don’t steep it longer, just add another teabag or two. You’re basically brewing a tea concentrate that you will cut later (much like our Chai Concentrate). A kitchen timer is helpful here.\n\n" +
                "3. Take out the tea bags.\n\n" +
                "4. If you like it sweet, this is your moment! Stir in the sugar until it has dissolved.\n\n" +
                "5. Pour it into a pitcher and add another 4 cups of water.\n\n" +
                "6. Chill. At least an hour in the fridge, so that the iced tea is cold and refreshing.\n\n" +
                "7. If you want to add fresh herbs, now is the time!\n\n" +
                "Serve over ice, and enjoy!\n",R.drawable.iced_tea,
                "Drinks"
        ));

        allRecipes.add(new Recipes(
                "Caesar Salad",
                "• 1 large or 2 small heads of romaine lettuce\n" +
                "• Parmesan cheese, shredded or shaved\n" +
                "• Crisp croutons – homemade can be made several days ahead. The recipe below makes enough for 2 salads.\n" +
                "• Caesar salad dressing",
                "Method",
                "How to Make Croutons:\n\n" + "1. Cut baguette in half lengthwise and slice into 1/4″ thick pieces and place on baking sheet.\n\n" +
                "2. Combine 3 Tbsp extra virgin olive oil with minced garlic. toss breads with garlic infused oil and 2 Tbsp parmesan.\n\n" +
                "3. Spread Evenly and Bake to desired crispness.\n\n" + "In a large mixing bowl, combine all of your ingredients and toss gently to coat the lettuce in caesar dressing. This recipe makes enough croutons for two full salads so you’ll have them ready to go for round 2!", R.drawable.caesar_salad,
                "Salad"

        ));

        allRecipes.add(new Recipes(
                "Pesto Pasta with Chicken",
                "• 1 (16 ounce) package bow tie pasta\n" +
                "• 1 teaspoon olive oil\n" +
                "• 2 cloves garlic, minced\n" +
                "• 2 skinless, boneless chicken breasts, cut into bite-sized pieces\n" +
                "• 1 pinch crushed red pepper flakes, or to taste\n" +
                "• ½ cup pesto sauce\n" +
                "• ⅓ cup oil-packed sun-dried tomatoes, drained and cut into strips",
                "Method",
                "1. Gather all ingredients.\n\n" +
                "2. Bring a large pot of lightly salted water to a boil. Add pasta and cook until al dente, 8 to 10 minutes; drain.\n" + "3. Heat oil in a large skillet over medium heat\n\n. Sauté garlic until tender.\n\n" + "4. Stir in chicken and season with red pepper flakes. Cook until chicken is golden and cooked through.\n\n" + "5. Combine pasta, chicken, pesto, and sun-dried tomatoes in a large bowl; toss to coat evenly.", R.drawable.pesto_pasta,
                "Main"

        ));

        allRecipes.add(new Recipes("Apple Pie", "Pie Dough:\n\n" +
                "• 2 ½ cups flour(315 g)\n" +
                "• 1 teaspoon salt\n" +
                "• 1 ½ sticks butter, 1 1/2 sticks, cold, cubed\n" +
                "• 8 tablespoons ice water, or as needed\n" + "\n" + "Filling:\n\n" + "• 2 ½ lb granny smith apple(1 kg), cored, sliced, peeled\n" +
                "• ¾ cup sugar(150 g)\n" +
                "• 2 tablespoons flour\n" +
                "• ½ teaspoon salt\n" +
                "• 1 teaspoon cinnamon\n" +
                "• ¼ teaspoon nutmeg\n" +
                "• ½ lemon\n" +
                "• 1 egg, beaten\n" +
                "• 1 tablespoon sugar\n" + "\n" + "Topping:\n\n" + "• 1 scoop vanilla ice cream",
                "Method",
                "1. In a medium-sized bowl, add the flour and salt. Mix with fork until combined.\n\n" +
                "2. Add in cubed butter and break up into flour with a fork. Mixture will still have lumps about the size of small peas.\n\n" +
                "3. Gradually add the ice water and continue to mix until the dough starts to come together. You may not need all of the water, but if the dough is too dry then add more. The dough should not be very tacky or sticky.\n\n" +
                "4. Work the dough together with your hands and turn out onto a surface. Work into a ball and cover with cling wrap. Refrigerate.\n\n" +
                "5. Peel the apples, then core and slice.\n" +
                "6. In a bowl, add the sliced apples, sugar, flour, salt, cinnamon, nutmeg, and juice from the lemon.\n\n" +
                "7. Mix until combined and all apples are coated. Refrigerate.\n\n" +
                "8. Preheat the oven to 375°F (200°C).\n\n" +
                "9. On a floured surface, cut the pie dough in half and roll out both halves until round and about ⅛-inch (3 mm) thick.\n\n" +
                "10. Roll the dough around the rolling pin and unroll onto a pie dish making sure the dough reaches all edges. Trim extra if necessary.\n\n" +
                "11. Pour in apple filling mixture and pat down.\n\n" +
                "12. Roll the other half of the dough on top.\n\n" +
                "13. Trim the extra dough from the edges and pinch the edges to create a crimp. Make sure edges are sealed together.\n\n" +
                "14. Brush the pie with the beaten egg and sprinkle with the sugar.\n\n" +
                "15. Cut four slits in the top of the pie to create a vent.\n\n" +
                "16. Bake pie for 50-60 minutes or until the crust is golden brown and no greyish or undercooked pastry remains.\n\n" +
                "17. Allow to cool completely before slicing.\n\n" +
                "18. Top with ice cream and serve.\n\n" +
                "Enjoy!", R.drawable.apple_pie,
                "Dessert"

        ));

        allRecipes.add(new Recipes("Boba Milk Tea",
                "(for 2 servings)\n\n" + "Boba Pearls:\n\n" + "• ⅓ cup water(75 g), plus more as needed\n" +
                "• ¼ cup dark muscovado sugar(55 g), or brown sugar\n" +
                "• ¾ cup tapioca flour(65 g), plus more for dusting\n" + "\n" + "Brown Sugar Syrup:\n\n" + "• 1 cup dark muscovado sugar(220 g), or brown sugar\n" +
                "• 1 cup water(240 mL)\n" + "\n" + "Black Tea:\n\n" + "• 2 cups water(480 mL)\n" +
                "• 6 black tea bags\n" + "\n" + "Milk Mixture:\n\n" + "• 3 tablespoons half & half\n" +
                "• 3 tablespoons sweetened condensed milk\n" + "\n" + "Assembly:\n\n" + "• 3 cups ice(450 g), divided\n" + "\n" + "Special Equipment:\n\n" + "• wide-opening straw",
                "Method",
                "1. Make the boba pearls: Add the water and muscovado sugar to a medium pan over medium-high heat. Cook until the sugar dissolves and the mixture comes to a boil, 3–4 minutes. Add a bit of the tapioca flour and cook, stirring constantly, until smooth. Add half of the remaining tapioca flour and stir vigorously until a sticky dough forms. Turn off the heat and add the remaining tapioca flour. Stir until the dough comes together in a ball (not all of the flour will be incorporated at this stage). Let cool slightly.\n\n" +
                "2. Turn the dough out onto a clean surface. Knead until all of the flour is incorporated and the dough is smooth, adding more flour or water as needed if the dough is too sticky or too dry.\n\n" +
                "3. Divide the dough into 2 portions. Roll the dough into long, thin ropes about ¼-inch (6.35 mm) thick, cutting in half crosswise if they get too long. Cut the ropes into ¼-inch (6.35 mm) pieces. Roll each piece into a ball and place in a bowl with a bit of tapioca flour. Dust the balls with the flour to prevent them from sticking to each other.\n\n" +
                "4. Bring a large pot of water to a boil. Shake off any excess flour from the tapioca pearls, then add to the boiling water. Stir to separate the pearls, then reduce the heat to medium-low. Simmer gently, stirring occasionally, for about 20 minutes, until cooked through.\n\n" +
                "5. Meanwhile, make the brown sugar syrup: Add the muscovado sugar and water to a small saucepan over medium heat. Cook until the sugar dissolves and the syrup reduces slightly, 5–7 minutes. Pour the syrup into a large heatproof bowl.\n\n" +
                "6. Once the pearls have cooked through, drain and rinse with cold water. Add the pearls to the bowl with the brown sugar syrup and let sit for 30–60 minutes.\n\n" +
                "7. Make the black tea: In a medium pot over high heat, combine the water and tea bags. Bring to a boil, then remove the pan from the heat and let the tea cool to room temperature.\n\n" +
                "8. Make the milk mixture: In a small bowl or liquid measuring cup, whisk together the half-and-half and sweetened condensed milk until combined.\n\n" +
                "9. Assemble the boba milk tea: Add about ⅓ cup (80 ml) boba pearls and brown sugar syrup to the bottom of each glass. Top with 1½ cups (225 grams) ice, then add ½ cup (240 ml) black tea and 3 tablespoons of the milk mixture. Stir with a wide-opening straw, then serve.\n\n" +
                "Enjoy!", R.drawable.boba_milk_tea, "Drinks"

        ));

        allRecipes.add(new Recipes("Spicy Kani Salad", "• Kani – Imitation Crab Stick, there’s really no substitute here. And don’t bother trying to up the ante with real crab because it just won’t be the same. Save your money.\n" +
                "• Cucumber – I like to use an English cucumber here because it’s seedless so you won’t really have too much work messing with removing the seeds. It’s not a big deal if you can only get your hands on a regular cucumber, though.\n" +
                "• Carrots – If you can find already shredded or “shoestring cut” carrots, it’s a huge timesaver.\n" +
                "• Mango – Make sure you grab a mango that’s still firm but gives a little so you know it’s going to be juicy. OR, if your grocery store sells precut mango grab it. You’ll save a ton of time.\n" +
                "• Japanese Mayo – So much more flavor than regular mayo….I think it has fish sauce or something in it to give it that umami flavor. But if you can’t find it, don’t stress…just use regular mayo with a drop or two of fish sauce. \n" +
                "• Lemon – Just a regular, run of the mill lemon…nothing fancy.\n" +
                "• Salt and Pepper", "Method", "1. Whisk together the dressing; mayonnaise, Sriracha, lemon juice, lemon zest, soy sauce, salt and pepper. Set aside.\n\n" +
                "2. Peel and cut the cucumber. Remove the seeds and cut into long thin strips.\n\n" +
                "3. Peel and cut the carrots. If you are using matchstick carrots, you can skip this step.\n\n" +
                "4. Peel and cut the mango into long thin strips.\n\n" +
                "5. Shred the crabmeat into thin strips.\n\n" +
                "6. Add the cucumbers, carrots, mango and crab to a bowl. \n\n" +
                "7. Pour the dressing over the ingredients.\n\n" +
                "8. Toss the salad to combine.", R.drawable.kani_salad, "Salad"

        ));



        recipes = new ArrayList<>(allRecipes);

        myrecyclerView = findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);

        categorySpinner = findViewById(R.id.category_spinner);
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, R.layout.spinner_item, new String[]{"All", "Main", "Drinks", "Dessert", "Salad"});
        spinnerAdapter.setDropDownViewResource(R.layout.spinner_item);
        categorySpinner.setAdapter(spinnerAdapter);

        categorySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedCategory = parentView.getItemAtPosition(position).toString();
                filterRecipesByCategory(selectedCategory);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                filterRecipesByCategory("All");
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    private void filterRecipesByCategory(String category) {
        if (category.equals("All")) {
            recipes = new ArrayList<>(allRecipes);
        } else {
            recipes = new ArrayList<>();
            for (Recipes recipe : allRecipes) {
                if (recipe.getCategory().equals(category)) {
                    recipes.add(recipe);
                }
            }
        }
        myAdapter.updateData(recipes);
    }

}