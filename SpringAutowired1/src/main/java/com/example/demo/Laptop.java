package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class Laptop {
	int lid;
	String memory;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	
	public Laptop()
	{
		System.out.println("Constructor from Laptop");
	}
	
	void showLaptop()
	{
		System.out.println("Laptop show method is called");
	}
	

}
