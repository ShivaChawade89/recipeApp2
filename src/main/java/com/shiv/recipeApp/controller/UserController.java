package com.shiv.recipeApp.controller;




import com.shiv.recipeApp.model.Recipe;
import com.shiv.recipeApp.model.User;
import com.shiv.recipeApp.service.RecipeService;
import com.shiv.recipeApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    RecipeService recipeService;

    @PostMapping("sinup")
    public String sinup(@RequestBody User user){
       return userService.sinup(user);

    }

    @PostMapping("/postRecipe")
    public Recipe addRecipe(Recipe recipe) {
        return recipeService.addRecipe(recipe);
    }

    @GetMapping("getRecipeByName/{name}")
    public Recipe getRecipeByName(@PathVariable  String name){
        return recipeService.getRecipeByName(name);
    }

    @PutMapping("updateRecipe/{recipeName}/{username}/{password}")
    public String updateRecipe (@RequestBody Recipe newRecipe,@PathVariable String recipeName, @PathVariable String username,@PathVariable String password){


        User user =userService.findByUserNameAndPassword(username,password);
        if (user !=null){

            Recipe recipe=recipeService.getRecipeByName(recipeName);

            recipe.setName(newRecipe.getName());
            recipe.setIngredients(newRecipe.getIngredients());
            recipe.setInstructions(newRecipe.getInstructions());

            recipeService.addRecipe(recipe);

        }else {
            return "not matched username and password";
        }

        return  "recipe updated successfully";
    }


}
