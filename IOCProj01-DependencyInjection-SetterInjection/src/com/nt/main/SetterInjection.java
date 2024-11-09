package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Config.AppConfig;
import com.nt.sbean.Test;

public class SetterInjection 
{
public static void main(String[] args) {

	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
	Test t = ctx.getBean("ts",Test.class);
	      
	String restult =t.service();
	
	System.out.println("Results =>"+restult);
	ctx.close();
	
}
}
