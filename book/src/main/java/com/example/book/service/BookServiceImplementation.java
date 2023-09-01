package com.example.book.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.entity.BookEntity;
import com.example.book.repository.BookRepository;

@Service
public class BookServiceImplementation implements BookService{
	@Autowired

	private BookRepository bookRepository;

	@Override
	public BookEntity getBook(int id) {
		Optional<BookEntity> optional=bookRepository.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		return optional.get();
	}
	
	@Override

	public int addBook(BookEntity book) {
		BookEntity save=bookRepository.save(book);
		return save.getId();
		}

	@Override

	public List<BookEntity> getAllBooks(){
		return bookRepository.findAll();
	}

	@Override
	public void updateBook(BookEntity book) {
		bookRepository.save(book);
		
	}

    @Override
	public void deleteBookEntity(int id) {
		Optional<BookEntity> optional = bookRepository.findById(id);
		if(!optional.isEmpty()) {
		  bookRepository.delete(optional.get());
		}
	}

}