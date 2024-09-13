package com.samir2.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samir2.course.entities.Order;
import com.samir2.course.entities.User;
import com.samir2.course.repositories.OrderRepository;
import com.samir2.course.repositories.UserRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findAById(Long Id) {
	    Optional<Order> obj  = repository.findById(Id);
	    return obj.get();
	}

}
