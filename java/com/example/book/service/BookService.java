package com.example.book.service;


import java.util.List;
import com.example.book.entity.BookEntity;

public interface BookService {

	BookEntity getBook(int id);

	int addBook(BookEntity book);
	
	List<BookEntity> getAllBooks();
	
	void updateBook(BookEntity book);

	void deleteBookEntity(int id);


}