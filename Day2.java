package com.example.day1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Day2 {
 @Value("${var}")
 private String name;
 @GetMapping("Risi")
 public String display() 
 {
	 return "Hello "+name;
 }
}
