package com.samir2.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samir2.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
