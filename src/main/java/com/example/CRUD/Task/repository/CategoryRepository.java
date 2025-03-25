package com.example.CRUD.Task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.CRUD.Task.model.Category; 

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
