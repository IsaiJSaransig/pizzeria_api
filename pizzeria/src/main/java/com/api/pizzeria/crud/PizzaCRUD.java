package com.api.pizzeria.crud;

import com.api.pizzeria.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface PizzaCRUD extends ListCrudRepository<PizzaEntity, Integer> {
}
