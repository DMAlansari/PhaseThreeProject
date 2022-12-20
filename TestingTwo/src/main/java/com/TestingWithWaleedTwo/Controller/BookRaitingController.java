package com.TestingWithWaleedTwo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.TestingWithWaleedTwo.Services.BookRaitingService;
import com.TestingWithWaleedTwo.dao.Book;

@RestController
public class BookRaitingController {
	
	@Autowired
	BookRaitingService service;

	@GetMapping("/rating/{bookId}")
	Book getBookRating(@PathVariable Integer bookId) {
		return service.getBookRating(bookId);
	}
	
	
	@GetMapping("/rating/all")
		List<Object> getAllBooks() {
			return service.getAllBooks();
		}
	
	
	
	
	
	
	
}
