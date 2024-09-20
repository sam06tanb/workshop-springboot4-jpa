package com.samir2.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samir2.course.entities.User;
import com.samir2.course.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(EntityNotFoundException id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new EntityNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		update(entity, obj);
		return repository.save(entity);
	}

	private void update(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}

	public User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
