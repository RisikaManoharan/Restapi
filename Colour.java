package com.example.day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Colour {
@GetMapping("colour")
public String getMyFav() {
	String s="Green";
	return "My favourite colour is "+s;
}
}

