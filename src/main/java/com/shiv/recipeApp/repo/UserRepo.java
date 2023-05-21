package com.shiv.recipeApp.repo;

import com.shiv.recipeApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,Integer> {
    @Query(value = "select * from  user where user_name =:username && password=:password",nativeQuery = true)
    User FindByUserNameANDPassword(String username, String password);
}
