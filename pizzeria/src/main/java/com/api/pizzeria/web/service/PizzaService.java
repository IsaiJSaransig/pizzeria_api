package com.api.pizzeria.web.service;

import com.api.pizzeria.dto.Pizza.CreatePizzaDTO;
import com.api.pizzeria.dto.Pizza.GetPizzaDTO;
import com.api.pizzeria.entity.PizzaEntity;
import com.api.pizzeria.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {
    @Autowired
    private PizzaRepository pizzaRepository;

    public List<GetPizzaDTO> getPizzas() {
        return pizzaRepository.getPizzaList();
    }

    public GetPizzaDTO getPizzaById(int id) {
        return pizzaRepository.getPizzaById(id);
    }

    public GetPizzaDTO createPizza(CreatePizzaDTO pizza) {
        return pizzaRepository.createPizza(pizza);
    }

    public List<GetPizzaDTO> getPizzaByIngredient(String ingredient) {
        return pizzaRepository.getByIngredient(ingredient);
    }

    public boolean deletePizza(int id) {
        return pizzaRepository.deletePizza(id);
    }

    public GetPizzaDTO updatePizza(int id, CreatePizzaDTO pizza) {
        return pizzaRepository.updatePizza(id, pizza);
    }
}
