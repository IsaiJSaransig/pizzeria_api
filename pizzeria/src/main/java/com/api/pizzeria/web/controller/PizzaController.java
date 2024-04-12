package com.api.pizzeria.web.controller;

import com.api.pizzeria.dto.Pizza.CreatePizzaDTO;
import com.api.pizzeria.dto.Pizza.GetPizzaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.api.pizzeria.web.service.PizzaService;

import java.util.List;

@RestController
@RequestMapping("/pizzas")
public class PizzaController {
    @Autowired
    private PizzaService pizzaService;

    @GetMapping
    public ResponseEntity<List<GetPizzaDTO>> getPizzas() {
        return new ResponseEntity<>(pizzaService.getPizzas(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetPizzaDTO> getPizzaById(@PathVariable("id") int id) {
        GetPizzaDTO getPizzaDTO = pizzaService.getPizzaById(id);
        return new ResponseEntity<>(getPizzaDTO, getPizzaDTO != null ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<GetPizzaDTO> createPizza(@RequestBody CreatePizzaDTO createPizzaDTO) {
        return new ResponseEntity<>(pizzaService.createPizza(createPizzaDTO), HttpStatus.CREATED);
    }

    @GetMapping("/ingredient/{ingredient}")
    public ResponseEntity<List<GetPizzaDTO>> getPizzaByIngredient(@PathVariable("ingredient") String ingredient) {
        return new ResponseEntity<>(pizzaService.getPizzaByIngredient(ingredient), HttpStatus.OK);
    }
}
