package com.api.pizzeria.mapper;

import com.api.pizzeria.dto.OrderItem.GetOrderItemDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.api.pizzeria.entity.OrderItemEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {
    @Mappings({
        @Mapping(source = "id.itemId" , target = "idItem"),
        @Mapping(source = "id.orderId" , target = "idOrder"),
    })
    GetOrderItemDTO toGetOrderItemDTO(OrderItemEntity orderItemEntity);
    List<GetOrderItemDTO> toGetOrderItemDTOList(List<OrderItemEntity> orderItemEntities);

    @Mappings({
        @Mapping(target = "pizza" , ignore = true),
        @Mapping(target = "order" , ignore = true)
    })
    OrderItemEntity toOrderItemEntity(GetOrderItemDTO getOrderItemDTO);
}
