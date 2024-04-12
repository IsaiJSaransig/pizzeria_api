package com.api.pizzeria.dto.Pizza;

import java.math.BigDecimal;

public class GetPizzaDTO {

    private Integer id;
    private String name;
    private String description;
    private BigDecimal price;
    private Boolean vegeterian;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getVegeterian() {
        return vegeterian;
    }

    public void setVegeterian(Boolean vegeterian) {
        this.vegeterian = vegeterian;
    }
}
