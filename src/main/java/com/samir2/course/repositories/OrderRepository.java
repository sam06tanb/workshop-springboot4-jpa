package com.samir2.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samir2.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

      

}
