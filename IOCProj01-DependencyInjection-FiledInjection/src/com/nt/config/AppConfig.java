
package com.nt.config;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig 
{
	public AppConfig(){
		System.out.println("AppConfig:0 args Constructor ");
	}
	@Bean(name="ld")
	public LocalTime createTime(){
		System.out.println("AppConfig.createTime()");
		return LocalTime.now();
	}
	@Bean(name="lld")
	public LocalDate createDate() {
		return LocalDate.now();
	}
	@Bean(name="ldt")
	public LocalDateTime createDateTime() {
		return LocalDateTime.now();
	}

}
