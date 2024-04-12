package com.api.pizzeria.web.service;

import com.api.pizzeria.dto.Pizza.CreatePizzaDTO;
import com.api.pizzeria.dto.Pizza.GetPizzaDTO;
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
}
