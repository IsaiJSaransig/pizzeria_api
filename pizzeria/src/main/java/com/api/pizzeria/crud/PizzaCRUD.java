package com.api.pizzeria.crud;

import com.api.pizzeria.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface PizzaCRUD extends ListCrudRepository<PizzaEntity, Integer> {
    List<PizzaEntity> findByDescriptionContaining(String ingredient);
}
