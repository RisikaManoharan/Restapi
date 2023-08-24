package com.example.day4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day4.entity.Studentrecord;

public interface StudentInterface extends JpaRepository<Studentrecord,Integer>{
	
}