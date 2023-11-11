package com.example.magicpost.repository;

import com.example.magicpost.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<Product, Long> {
}
