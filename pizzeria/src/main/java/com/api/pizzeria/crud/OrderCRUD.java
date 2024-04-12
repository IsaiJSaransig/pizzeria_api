package com.api.pizzeria.crud;
import com.api.pizzeria.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;
public interface OrderCRUD extends ListCrudRepository<OrderEntity, Integer> {
}
