package com.nt.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.pton.CSE_Book;
@ComponentScan(basePackages = "com.nt")
@Configuration
public class AppConfig
{
@Bean
	public CSE_Book getInsta() {
		
		
		return CSE_Book.getInstance(); 
	}
	
	
}
