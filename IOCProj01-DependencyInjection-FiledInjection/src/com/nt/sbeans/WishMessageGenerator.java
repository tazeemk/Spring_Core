//WishMessageGenerator.java (target class)
package com.nt.sbeans;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator 
{
	//Injecting LocalTime object
       @Autowired
	   private LocalTime lt;
       private LocalDateTime ldt;
       private LocalDate lld;
       @Autowired
       public WishMessageGenerator() {
    	   System.out.println("WishMessageGenerator:0 args Constructor :");
       }
       @Autowired(required=false)
       public void WishMessageGenerator(LocalTime lt,LocalDate lld) {
    	   this.lt=lt;
    	   this.lld=lld;
    	   System.out.println("Local Time :"+lt+" Local Date :"+lld);
           System.out.println("WishMessageGenerator: 2 param Constructor :");
       }
       @Autowired
	public void WishMessageGenerator(LocalTime lt)
       {
		this.lt=lt;
		System.out.println("WishMessageGenerator:1 param Constructor :");
	   }
       @Autowired
       public void WishMessageGenerator(LocalTime lt,LocalDateTime ldt,LocalDate lld){
    	   this.ldt=ldt;
    	   this.lld=lld;
    	   this.lt=lt;
    	   System.out.println("Local Time :"+lt+" Local Date :"+lld+"LocalDateTime :"+ldt);
    System.out.println("WishMessageGenerator: 3 param Constructor :");
       }
       
       //Business Method
	public String generator(String user) {
	System.out.println("WishMessageGenerator.generator()");
	int date =lt.getHour();	
	    if(date<12)
		return "Good Morning "+user;
		else if(date>12 && date<16)
		return "Good After noon ::"+user;
		else if(date>16 && date<20)
			return "Good Evening ::"+user;
		else
			return "Good Night"+user;
	}
	
}
