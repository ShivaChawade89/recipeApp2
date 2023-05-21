package com.shiv.recipeApp.service;


import com.shiv.recipeApp.model.Recipe;
import com.shiv.recipeApp.repo.RecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    @Autowired
    RecipeRepo recipeRepo;
    public Recipe addRecipe(Recipe recipe) {
        return recipeRepo.save(recipe);
    }

    public List<Recipe> getRecipe() {
        return recipeRepo.findAll();
    }

    public Recipe getRecipeByName(String name) {
        return recipeRepo.findByName(name);
    }

    public String updateRecipe(Recipe newRecipe, Integer id) {
        Recipe recipe = recipeRepo.findById(id).get();

        recipe.setInstructions(newRecipe.getInstructions());
        recipe.setIngredients(newRecipe.getIngredients());
        recipe.setName(newRecipe.getName());

        recipeRepo.save(recipe);

        return "recipe updated";

    }

    public String deleteById(Integer id) {

        recipeRepo.deleteById(id);

        return "deleted successfully";

    }
}
