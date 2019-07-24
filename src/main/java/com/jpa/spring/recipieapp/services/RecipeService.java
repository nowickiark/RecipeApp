package com.jpa.spring.recipieapp.services;

import com.jpa.spring.recipieapp.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
