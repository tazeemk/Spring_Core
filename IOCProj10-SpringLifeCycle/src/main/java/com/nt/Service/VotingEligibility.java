package com.nt.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
@PropertySource("com/nt/Commons/Myfile.properties")
@Component("ser")
public class VotingEligibility 
{

	
	
	
   @Value("${per.id}")
	private int id;
   
   @Value("${per.name}")	
	private String name;
   
   @Value("${per.age}")
	private int age;
	
   
	private Date currentDate;
	
	
	
	@PostConstruct
	public void inti() 
	{
		System.out.println("VotingEligibility.inti()");
		
		 currentDate = new Date();
		if(age<=0 ) {
			
			throw new IllegalArgumentException("Invalid age ");
		}
		
	}
	
	public String checkeligibility() 
	{
	
		if(age<=18)
		return " Sorry : "+name + ": You are not eligible for voting || Verified on :"+currentDate;
		else
			return  " Welcome : "+name +"You are eligible for voting || Verified on :"+currentDate;
		
	}
	
	@PreDestroy
	public void des() 
	{
	
		id=0;
		name=null;
		age=0;
		
		
	}
	
	
}
