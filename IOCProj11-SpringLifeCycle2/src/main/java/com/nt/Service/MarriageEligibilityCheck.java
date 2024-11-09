package com.nt.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
@PropertySource("com/nt/Commons/myFile.properties")
@Service("service")
public class MarriageEligibilityCheck {
    @Value("${per.age}")
	private int age;
    @Value("${per.name}")
	private String name;
    @Value("${per.gender}")
	private String gender;
    @Value("${per.Quali}")
	private String Qualification;

	@PostConstruct
	public void inti() 
	{
		System.out.println("MarriageEligibilityCheck.inti()");
	
		//validation 
		if(age<=0 || age>=50) 
		{
		
			System.out.println("You Are Eligible For Dying ");
			throw new IllegalArgumentException();
		}

	}

	public String checkMarriageeligibility() {
		
	if(gender.equalsIgnoreCase("male")) {
	
		if(age>=22) {
		return name+" : You are ready for marriage :"+Qualification;
		}
		else{
			return name+" : You are not ready for marriage :"+Qualification;
		}
			
		}else {
			if(age>=18)
				return name+" : You are ready for marriage :"+Qualification;
			else
				return name+" : You are not ready for marriage :"+Qualification;
		}
		
	
	}	
		
		
	
	@PreDestroy
	public void dest() 
	{
	age =0;
	name=null;
	Qualification=null;
	
		
		
	}

}
