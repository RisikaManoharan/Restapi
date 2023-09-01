package com.example.day6.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6.entity.ChildEntity;
import com.example.day6.repository.ChildRepository;

@Service
public class ChildService {
	@Autowired
	private ChildRepository childrepository;
	public Page<ChildEntity> getBabyByField(String field,int pageNo,int pageSize){
		Sort sort=Sort.by(field);
		Pageable pageable=PageRequest.of(pageNo, pageSize, sort);
		return childrepository.findAll(pageable);
	}
	public ChildEntity getBaby(int babyid) {
		Optional<ChildEntity> optional=childrepository.findById(babyid);
		if(optional.isEmpty()) {
			return null;
		}
		return optional.get();
	}

	public int addBaby(ChildEntity f){
	     ChildEntity save=childrepository.save(f);
		return save.getBabyid();
		}
	
	public List<ChildEntity> getAllBaby(){
		return childrepository.findAll();
	}
	
	public void updateBaby(ChildEntity f) {
		childrepository.save(f);
		
	}

}
