package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class StrudentController {

	  
	  //@Qualifier("dog")
	  Animal a;
	
	  
	  
	
	  @Autowired(required=false) public void setA(@Qualifier("dog") Animal a) { this.a = a; }
	 


	/*
	 * @Autowired(required=false) public StrudentController( @Qualifier ("dog")
	 * Animal a) { super(); this.a = a; }
	 */



	@GetMapping("/abc")
	String display()
	{
		  
		return a.sound(); 
		
	}
}
