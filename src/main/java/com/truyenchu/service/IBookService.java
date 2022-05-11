package com.truyenchu.service;

import java.util.List;
import java.util.Map;

import com.truyenchu.dto.BookDTO;

public interface IBookService {
	Map<Long, String> findAllString();
	List<BookDTO> findAll();
}
