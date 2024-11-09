package com.nt.Config;

import java.time.LocalDate;
import java.util.stream.Stream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.sbean")
public class AppConfig 
{
public AppConfig() {
	System.out.println("AppConfig:0 param Constructor :");
}
	
public void display() {
	System.out.println("AppConfig.display()");
	System.out.println("AppConfig display Method");
}
@Bean
public LocalDate createDate(){
	System.out.println("AppConfig.createDate()");
	return LocalDate.now();
}
	
}
