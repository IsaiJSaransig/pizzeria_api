package com.api.pizzeria.repository;

import com.api.pizzeria.crud.PizzaCRUD;
import com.api.pizzeria.dto.Pizza.CreatePizzaDTO;
import com.api.pizzeria.dto.Pizza.GetPizzaDTO;
import com.api.pizzeria.entity.PizzaEntity;
import com.api.pizzeria.mapper.PizzaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class PizzaRepository {
    @Autowired
    private PizzaMapper pizzaMapper;
    @Autowired
    private PizzaCRUD pizzaCRUD;

    public List<GetPizzaDTO> getPizzaList() {
        return pizzaMapper.toGetPizzaDTOList(pizzaCRUD.findAll());
    }

    public GetPizzaDTO getPizzaById(Integer id) {
        return pizzaMapper.toGetPizzaDTO(pizzaCRUD.findById(id).get());
    }

    public GetPizzaDTO createPizza(CreatePizzaDTO createPizzaDTO) {
        PizzaEntity pizzaEntity = pizzaMapper.toPizzaEntity(createPizzaDTO);
        return pizzaMapper.toGetPizzaDTO(pizzaCRUD.save(pizzaEntity));
    }


}
