package com.api.pizzeria.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "pizza_order")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "id_order", columnDefinition = "INT")
    private Integer idOrder;

    @Column(name = "id_customer", columnDefinition = "INT")
    private Integer idCustomer;

    @Column(columnDefinition = "DATETIME")
    private LocalDateTime date;

    @Column(columnDefinition = "DECIMAL(10,2)")
    private BigDecimal total;

    @OneToMany(mappedBy = "order")
    private List<OrderItemEntity> orderItems;

    @OneToOne
    @JoinColumn(name = "id_customer", insertable = false, updatable = false)
    private CustomerEntity customer;

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

    public List<OrderItemEntity> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemEntity> orderItems) {
        this.orderItems = orderItems;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }
}
