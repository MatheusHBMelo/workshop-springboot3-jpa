package com.theuz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theuz.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
