package com.example.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
