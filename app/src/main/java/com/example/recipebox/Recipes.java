package com.example.recipebox;

public class Recipes {

    private String RecipeName;
    private String RecipeIngredients;
    private String RecipeMethodTitle;
    private String Recipe;
    private int Thumbnail;
    private String Category;

    public Recipes(String name, String ingredients, String recipeMethod, String recipe, int thumbnail, String category) {

        RecipeName = name;
        RecipeIngredients = ingredients;
        RecipeMethodTitle = recipeMethod;
        Recipe = recipe;
        Thumbnail = thumbnail;
        Category = category;

    }

    public String getRecipeName() {
        return RecipeName;
    }

    public String getRecipeIngredients() {
        return RecipeIngredients;
    }

    public String getRecipeMethodTitle() {
        return RecipeMethodTitle;
    }

    public String getRecipe() {
        return Recipe;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public String getCategory() {
        return Category;
    }
}
