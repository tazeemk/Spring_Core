package com.nt.sbean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.Config.AppConfig;

@Component("ts")
public class Test{
      
	private AppConfig app;
	private LocalDate lt;
      
	public Test() {
		System.out.println("Test:0 param Constructor :");
	}
	
	
       @Autowired
	public void setApp(AppConfig app) 
       {
    	   System.out.println("Test.setApp()");
		this.app = app;
	}
       @Autowired
       public void setlt(LocalDate lt) {
    	   System.out.println("Test.setlt()");
    	   this.lt=lt;
       }



	public String service(){
    	  System.out.println("Test.service()");
    	app.display();  
    	  return "java";
      }
}
