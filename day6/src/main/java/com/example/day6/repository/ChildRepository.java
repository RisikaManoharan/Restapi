package com.example.day6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day6.entity.ChildEntity;

public interface ChildRepository  extends JpaRepository<ChildEntity,Integer>{

}
