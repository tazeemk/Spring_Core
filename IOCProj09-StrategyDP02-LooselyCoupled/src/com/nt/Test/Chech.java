package com.nt.Test;

import com.nt.Comps.Vehicle;
import com.nt.Config.AppConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public final class Chech 
{

	public static void main(String[] args) {
		
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	
    Vehicle v = ctx.getBean("veh",Vehicle.class);	
	
	
	v.journey("jaunpur", "new delhi");
	ctx.close();	
	}
	
}
