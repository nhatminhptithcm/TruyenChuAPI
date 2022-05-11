package com.truyenchu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truyenchu.entity.ChapterEntity;

public interface ChapterRepository extends JpaRepository<ChapterEntity, Long> {
	
}
