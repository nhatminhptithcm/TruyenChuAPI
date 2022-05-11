package com.truyenchu.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truyenchu.converter.BookConverter;
import com.truyenchu.dto.BookDTO;
import com.truyenchu.entity.BookEntity;
import com.truyenchu.repo.BookRepository;
import com.truyenchu.service.IBookService;

@Service
public class BookService implements IBookService {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private BookConverter bookConverter;

	@Override
	public List<BookDTO> findAll() {
		List<BookDTO> models = new ArrayList<>();
		List<BookEntity> entities = bookRepository.findAll();
		for (BookEntity item : entities) {
			BookDTO BookDTO = bookConverter.toDto(item);
			models.add(BookDTO);
		}
		return models;
	}

	@Override
	public Map<Long, String> findAllString() {
		// TODO Auto-generated method stub
		return null;
	}

}
