package com.truyenchu.converter;

import org.springframework.stereotype.Component;

import com.truyenchu.dto.BookDTO;
import com.truyenchu.entity.BookEntity;

@Component
public class BookConverter {
	
	

	public BookDTO toDto(BookEntity entity) {
		BookDTO result = new BookDTO();
		
		return result;
	}
	
	public BookEntity toEntity(BookDTO dto) {
		BookEntity result = new BookEntity();
		
		return result;
	}
	
	public BookEntity toEntity(BookEntity result, BookDTO dto) {
		result.setTitle(dto.getTitle());
		
		return result;
	}
}
