package com.api.pizzeria.web.controller;

import com.api.pizzeria.dto.Order.GetOrderDTO;
import com.api.pizzeria.web.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("")
    public List<GetOrderDTO> getOrders() {
        return orderService.getOrderList();
    }
}
