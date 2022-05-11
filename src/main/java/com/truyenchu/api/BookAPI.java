package com.truyenchu.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truyenchu.dto.BookDTO;
import com.truyenchu.service.IBookService;

@RestController()
@RequestMapping("/api/baitap")
public class BookAPI {
	
	@Autowired
	private IBookService bookService;
	
	@GetMapping("")
    public ResponseEntity<List<BookDTO>> getAllBook() {
        List<BookDTO> books = bookService.findAll();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
