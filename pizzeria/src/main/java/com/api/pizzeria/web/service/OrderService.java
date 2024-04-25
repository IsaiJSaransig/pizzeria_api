package com.api.pizzeria.web.service;

import com.api.pizzeria.dto.Order.GetOrderDTO;
import com.api.pizzeria.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<GetOrderDTO> getOrderList() {
        return orderRepository.getOrderList();
    }

    public GetOrderDTO getOrderById(Integer idOrder) {
        return orderRepository.getOrderById(idOrder);
    }
}
