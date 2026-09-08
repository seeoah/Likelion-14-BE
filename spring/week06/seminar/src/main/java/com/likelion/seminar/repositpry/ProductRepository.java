package com.likelion.seminar.repositpry;

import com.likelion.seminar.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
