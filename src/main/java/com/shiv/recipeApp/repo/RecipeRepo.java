package com.shiv.recipeApp.repo;

import com.shiv.recipeApp.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepo extends JpaRepository<Recipe,Integer> {
    Recipe findByName(String name);
}
