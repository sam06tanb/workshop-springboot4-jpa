package com.samir2.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samir2.course.entities.OrderItem;
import com.samir2.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}