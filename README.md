# recipeApp2



# FramewarkUsed

     In this application i have used springboot framework 
     
# LanguagesUsed 
     i have used java lalguage for this project

# DataFlow 
     RecipeController:
               post /recipe - post the recipe
               GET /recipe/ - get all recipe
               PUT /recipe/{id} - update an recipe by id
               DELETE /recipe/{id} - delete an recipe by id
     userController:
               GET /user/getRecipeByName - get the recipe by its name
               PUT /user/updateRecipe/{recipeName}/{userName}/{password} - update user if authenticated with userId and Password
               POST user/postRecipe - post n new recipe
               POST /user/sinUp - register user
               
     the request will come to the respected method
     all the  respected ethods will be called  and 
     finally the response will returned to the user
     
     
 # Service
       UserService :
                 in the service layer all the business logic have been written of the user
       
       RecipeService :
                  in the service layer all the business logic have been written of the recipe
        
        
        this layer is work between repo layer and controller layer
        
 # Repository
 
        UserRepo :
                    In this layer i have extends jpaRepository which is allow me to perform crup opertaions on user.
                    
        RecipeRepo :
                    In this layer i have extends jpaRepository which is allow me to perform crup opertaions on Recipe.
                    
        Repository layer basicallu user for performing queries 0n respective databases and tables
                    
                  
     
# DataStructure 
     i have used MySQL database to store the recipe and users details.
   
# SUMMERY
      this application is basically designed for managing new recipies and managing it by users .they can add recipies and update it.
       this application is for create a many-to-one  between users and recipies:

      in this project i have used most popular framework springboot.
