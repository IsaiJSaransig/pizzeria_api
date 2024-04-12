package com.api.pizzeria.crud;
import com.api.pizzeria.entity.OrderItemEntity;
import org.springframework.data.repository.ListCrudRepository;
public interface OrderItemCRUD extends ListCrudRepository<OrderItemEntity, Long> {
}
