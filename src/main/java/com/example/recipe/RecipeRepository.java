package com.example.recipe;

import com.example.recipe.Recipe;
import java.util.*;

public interface RecipeRepository {
    ArrayList<Recipe> getAllRecipes();

    Recipe getRecipeById(int recipeId);

    Recipe addRecipe(Recipe recipe);

    Recipe updateRecipe(int recipeId, Recipe recipe);

    void deleteRecipe(int recipeId);

}