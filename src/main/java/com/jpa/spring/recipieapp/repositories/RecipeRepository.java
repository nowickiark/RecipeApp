package com.jpa.spring.recipieapp.repositories;

import com.jpa.spring.recipieapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
