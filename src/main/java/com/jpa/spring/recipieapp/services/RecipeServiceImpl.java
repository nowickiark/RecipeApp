package com.jpa.spring.recipieapp.services;

import com.jpa.spring.recipieapp.model.Recipe;
import com.jpa.spring.recipieapp.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }


    @Override
    public Set<Recipe> getRecipes() {

        Set <Recipe> recipeSet = new HashSet<>();

        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);

        return null;
    }
}
