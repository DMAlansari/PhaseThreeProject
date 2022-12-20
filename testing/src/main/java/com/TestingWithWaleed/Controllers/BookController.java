package com.TestingWithWaleed.Controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TestingWithWaleed.Books.Book;


@RestController
public class BookController {
	
	@GetMapping("/books")
	List<Book> getAllBooks() {
		return Arrays.asList(
				new Book(230, "hello", "A book about life"),
				new Book(146, "To Sell is Human", "About selling ideas"),
				new Book(881, "Bamboo Stalk", "A story about life's struggles")
				);
	}
}