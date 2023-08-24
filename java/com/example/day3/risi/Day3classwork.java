package com.example.day3.risi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day3classwork {
       @Value("1")
       public int id;
       @Value("Risi")
       public String name;
       @Value("19")
       public int age;
       @Value("80000000")
       public long salary;
       @RequestMapping("/post")
       public String post() {
    	   return id+"-"+name+"-"+age+"-"+salary;
       }
}
                                                                                                                                                                                                                                   