package com.example.day6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.day6.entity.ChildEntity;
import com.example.day6.service.ChildService;

@RestController
public class ChildController {
	@Autowired
	private ChildService childService;
	@PostMapping(path="/post")
	public ResponseEntity<Integer> addbaby(@RequestBody ChildEntity f) {
		int id = childService.addBaby(f);
		return ResponseEntity.status(HttpStatus.CREATED).body(id);
	}
	
	
	@GetMapping(path="/get/{babyid}")
	public ResponseEntity<List<ChildEntity>> getAllBaby(){
		List<ChildEntity> baby = childService.getAllBaby();
		return ResponseEntity.status(HttpStatus.OK).body(baby);
	}
	
	
	@PutMapping(path="/put")
	public ResponseEntity<String> updatebaby(@RequestBody ChildEntity f) {
	     childService.updateBaby(f);
		return ResponseEntity.ok("Updated");
	}
	@GetMapping(path="/getpage")
	public ResponseEntity<Page<ChildEntity>> getBabyByField(@RequestParam String field,@RequestParam int pageNo,@RequestParam int pageSize){
		Page<ChildEntity> baby=childService.getBabyByField(field, pageNo, pageSize);
		return ResponseEntity.ok(baby);
	}
	
}
