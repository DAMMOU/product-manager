package com.lmnader.productmanager.repository;

import com.lmnader.productmanager.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
