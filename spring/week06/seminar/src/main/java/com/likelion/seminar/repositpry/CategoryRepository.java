package com.likelion.seminar.repositpry;

import com.likelion.seminar.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
