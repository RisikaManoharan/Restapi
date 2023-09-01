package com.example.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.entity.BookEntity;
import com.example.book.service.BookService;

@RestController
public class BookController {

	
	@Autowired
	public BookService bookService;
	
	@GetMapping("/{id}")
	public ResponseEntity<BookEntity> getStudent(@PathVariable int id) {
		BookEntity book = bookService.getBook(id);
		if (book == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(book);
	}
	
	
	@PostMapping("/book")
	public ResponseEntity<Integer> addStudent(@RequestBody BookEntity book) {
		int id = bookService.addBook(book);
		return ResponseEntity.status(HttpStatus.CREATED).body(id);
	}
	
	
	@GetMapping("/book")
	public ResponseEntity<List<BookEntity>> getAllBooks(){
		List<BookEntity> book = bookService.getAllBooks();
		return ResponseEntity.status(HttpStatus.OK).body(book);
	}
	
	
	@PutMapping("/book")
	public ResponseEntity<String> updateBook(@RequestBody BookEntity book) {
		bookService.updateBook(book);
		return ResponseEntity.ok("Updated");
	}
	
	
	@DeleteMapping("/book")
	public ResponseEntity<String> deleteStudent(@RequestBody BookEntity book) {
		bookService.deleteBookEntity(book.getId());
		return ResponseEntity.ok("Deleted");
	}
}