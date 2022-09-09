package com.repository;

import com.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitOrderRepository extends JpaRepository<Order, Long> {
}
