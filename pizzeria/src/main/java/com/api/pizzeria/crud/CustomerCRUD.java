package com.api.pizzeria.crud;
import com.api.pizzeria.entity.CustomerEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface CustomerCRUD extends ListCrudRepository<CustomerEntity, Long> {
}
