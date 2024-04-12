package com.api.pizzeria.mapper;

import com.api.pizzeria.dto.Pizza.CreatePizzaDTO;
import com.api.pizzeria.dto.Pizza.GetPizzaDTO;
import com.api.pizzeria.entity.PizzaEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PizzaMapper {
    @Mappings({
            @Mapping(source = "idPizza", target = "id"),
    })
    GetPizzaDTO toGetPizzaDTO(PizzaEntity pizzaEntity);

    List<GetPizzaDTO> toGetPizzaDTOList(List<PizzaEntity> pizzaEntityList);

    @InheritInverseConfiguration
    @Mapping(target = "idPizza", ignore = true)
    PizzaEntity toPizzaEntity(CreatePizzaDTO createPizzaDTO);
}
