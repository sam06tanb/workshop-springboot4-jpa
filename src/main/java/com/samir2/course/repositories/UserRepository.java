package com.samir2.course.repositories;

import java.util.Optional;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;

import com.samir2.course.entities.User;

import jakarta.persistence.EntityNotFoundException;

public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findById(EntityNotFoundException id);

	void deleteById(EmptyResultDataAccessException id);
}
