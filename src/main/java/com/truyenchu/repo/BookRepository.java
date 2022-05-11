package com.truyenchu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truyenchu.entity.BookEntity;



public interface BookRepository extends JpaRepository<BookEntity, Long> {

}
