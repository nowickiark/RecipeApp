package com.jpa.spring.recipieapp.repositories;

import com.jpa.spring.recipieapp.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);

}
