package com.api.pizzeria.mapper;

import com.api.pizzeria.dto.Order.GetOrderDTO;
import com.api.pizzeria.entity.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {OrderItemMapper.class})
public interface OrderMapper {

    GetOrderDTO toGetOrderDTO(OrderEntity order);
    List<GetOrderDTO> toGetOrderDTOs(List<OrderEntity> orders);

    @Mapping(target = "customer", ignore = true)
    OrderEntity toOrderEntity(GetOrderDTO getOrderDTO);
}
