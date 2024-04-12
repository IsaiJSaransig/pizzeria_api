package com.api.pizzeria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
public class OrderItemPK implements Serializable {

    @Column(name = "id_item")
    private Long itemId;
    @Column(name = "id_order")
    private Long orderId;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
