package com.jpa.spring.recipieapp.repositories;

import com.jpa.spring.recipieapp.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository <UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);

}
