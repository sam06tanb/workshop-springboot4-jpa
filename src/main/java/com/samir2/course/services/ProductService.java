package com.samir2.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samir2.course.entities.Product;
import com.samir2.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findAById(Long Id) {
	    Optional<Product> obj  = repository.findById(Id);
	    return obj.get();
	}

}
