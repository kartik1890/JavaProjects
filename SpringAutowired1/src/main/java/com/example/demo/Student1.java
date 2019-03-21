package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
@Scope(value="prototype")
public class Student1 {

	int rollNo;
	String sname;
	
	@Autowired
	Laptop l1;
	
	public Laptop getL1() {
		return l1;
	}
	public void setL1(Laptop l1) {
		this.l1 = l1;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	void show()
	{
		System.out.println("Show method from Student1");
	}
	public Student1() {
		System.out.println("Constructor called...............");
	}
	

}
