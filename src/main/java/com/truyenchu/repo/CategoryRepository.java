package com.truyenchu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truyenchu.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
	CategoryEntity findOneByCode(String code);
}
