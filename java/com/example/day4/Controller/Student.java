package com.example.day4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day4.Service.StudentRecordService;
import com.example.day4.entity.Studentrecord;

@RestController
public class Student {
	@Autowired
    StudentRecordService studentrecord;
    
	@PostMapping("post")
	public Studentrecord insert(@RequestBody Studentrecord s) {
		return studentrecord.post(s);
	}
	@PutMapping("put")
	public  Studentrecord put(@RequestBody Studentrecord s)
	{
	return studentrecord.update(s);
	}
	@DeleteMapping("delete/{id}")
	public String del(@PathVariable int id)
	{
		studentrecord.delete(id);
		return "deleted";
	}
}
