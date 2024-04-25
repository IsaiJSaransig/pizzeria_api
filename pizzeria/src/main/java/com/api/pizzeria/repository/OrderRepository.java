package com.api.pizzeria.repository;

import com.api.pizzeria.crud.OrderCRUD;
import com.api.pizzeria.dto.Order.GetOrderDTO;
import com.api.pizzeria.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepository {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    OrderCRUD orderCRUD;

    public List<GetOrderDTO> getOrderList() {
        return orderMapper.toGetOrderDTOs(orderCRUD.findAll());
    }

    public GetOrderDTO getOrderById(Integer idOrder) {
        return orderMapper.toGetOrderDTO(orderCRUD.findById(idOrder).get());
    }
}
