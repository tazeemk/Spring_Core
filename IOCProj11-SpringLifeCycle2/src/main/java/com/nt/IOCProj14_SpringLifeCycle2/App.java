package com.nt.IOCProj14_SpringLifeCycle2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Config.AppConfig;
import com.nt.Service.MarriageEligibilityCheck;

public class App {
    public static void main(String[] args)
    {
    
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	MarriageEligibilityCheck mec= ctx.getBean("service",MarriageEligibilityCheck.class);
    	
    	String msg = mec.checkMarriageeligibility();
    	
    	System.out.println(msg);
    	
    	ctx.close();
    	
    	
    }
}
