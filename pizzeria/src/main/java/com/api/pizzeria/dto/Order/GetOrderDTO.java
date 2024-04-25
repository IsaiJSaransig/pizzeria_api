package com.api.pizzeria.dto.Order;

import com.api.pizzeria.dto.OrderItem.GetOrderItemDTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GetOrderDTO {

    private Integer idOrder;
    private Integer idCustomer;
    private LocalDateTime date;
    private BigDecimal total;
    private List<GetOrderItemDTO> orderItems;

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public List<GetOrderItemDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<GetOrderItemDTO> orderItems) {
        this.orderItems = orderItems;
    }
}
