package com.truyenchu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truyenchu.entity.AuthorEntity;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {
	AuthorEntity findOneByCode(String code);
}
