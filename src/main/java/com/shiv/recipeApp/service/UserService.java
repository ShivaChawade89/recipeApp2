package com.shiv.recipeApp.service;


import com.shiv.recipeApp.model.User;
import com.shiv.recipeApp.repo.RecipeRepo;
import com.shiv.recipeApp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    RecipeRepo recipeRepo;



    public String sinup(User user) {
        userRepo.save(user);
        return "User Registered";
    }

    public User findByUserNameAndPassword(String username,String password){
        return userRepo.FindByUserNameANDPassword(username,password);
    }
}
