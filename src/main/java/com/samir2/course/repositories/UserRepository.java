package com.samir2.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samir2.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}