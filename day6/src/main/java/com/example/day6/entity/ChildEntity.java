package com.example.day6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ChildEntity {
	@Id
	private int babyid;
	private String babyFirstName;
	private String babyLastName;
	private String fatherName;
	private String MotherName;
	private String address;
	public int getBabyid() {
		return babyid;
	}
	public void setBabyid(int babyid) {
		this.babyid = babyid;
	}
	public String getBabyFirstName() {
		return babyFirstName;
	}
	public void setBabyFirstName(String babyFirstName) {
		this.babyFirstName = babyFirstName;
	}
	public String getBabyLastName() {
		return babyLastName;
	}
	public void setBabyLastName(String babyLastName) {
		this.babyLastName = babyLastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public ChildEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChildEntity(int babyid, String babyFirstName, String babyLastName, String fatherName, String motherName,
			String address) {
		super();
		this.babyid = babyid;
		this.babyFirstName = babyFirstName;
		this.babyLastName = babyLastName;
		this.fatherName = fatherName;
		MotherName = motherName;
		this.address = address;
	}
	public String getMotherName() {
		return MotherName;
	}
	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
