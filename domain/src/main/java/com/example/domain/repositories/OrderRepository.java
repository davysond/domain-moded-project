package com.example.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
