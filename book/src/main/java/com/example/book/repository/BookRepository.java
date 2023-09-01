package com.example.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.book.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity,Integer>{

}