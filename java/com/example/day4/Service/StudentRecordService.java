package com.example.day4.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day4.entity.Studentrecord;
import com.example.day4.repository.StudentInterface;
@Service
public class StudentRecordService {
@Autowired
StudentInterface student;
	public Studentrecord post(Studentrecord s) {
		// TODO Auto-generated method stub
		return student.save(s);
	}

	public Studentrecord update(Studentrecord s) {
		// TODO Auto-generated method stub
		return student.save(s);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		student.deleteById(id);
	}

}
