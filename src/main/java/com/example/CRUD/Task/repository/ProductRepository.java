package com.example.CRUD.Task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.CRUD.Task.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
