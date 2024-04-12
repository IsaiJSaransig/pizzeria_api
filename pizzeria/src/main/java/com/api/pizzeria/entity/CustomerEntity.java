package com.api.pizzeria.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer", columnDefinition = "INT")
    private Integer idCustomer;

    @Column(name = "name", columnDefinition = "VARCHAR")
    private String name;

    @Column(name = "address", columnDefinition = "VARCHAR")
    private String address;

    @Column(name = "phone", columnDefinition = "VARCHAR")
    private String phone;

    @Column(name = "email", columnDefinition = "VARCHAR")
    private String email;

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
