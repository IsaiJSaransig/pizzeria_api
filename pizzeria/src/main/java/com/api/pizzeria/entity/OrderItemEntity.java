package com.api.pizzeria.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "order_item")
public class OrderItemEntity {

    @EmbeddedId
    private OrderItemPK id;
    @Column(name = "id_pizza", columnDefinition = "INT")
    private Integer idPizza;
    @Column(name = "quantity", columnDefinition = "INT")
    private Integer quantity;
    @Column(name = "price", columnDefinition = "DECIMAL(10,2)")
    private BigDecimal price;

    @OneToOne
    @JoinColumn(name = "id_pizza", insertable = false, updatable = false)
    private PizzaEntity pizza;

    @ManyToOne
    @JoinColumn(name = "id_order", insertable = false, updatable = false)
    private OrderEntity order;

    public OrderItemPK getId() {
        return id;
    }

    public void setId(OrderItemPK id) {
        this.id = id;
    }

    public Integer getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(Integer idPizza) {
        this.idPizza = idPizza;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
