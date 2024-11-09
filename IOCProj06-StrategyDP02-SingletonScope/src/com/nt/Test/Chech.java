package com.nt.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Comps.PetrolEngine;
import com.nt.Comps.Vehicle;
import com.nt.Config.AppConfig;

public final class Chech 
{

	public static void main(String[] args) {
		
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	
    Vehicle v = ctx.getBean("veh",Vehicle.class);	
	Vehicle v1=ctx.getBean("veh",Vehicle.class);
	
	
	PetrolEngine p = ctx.getBean("pEng",PetrolEngine.class);
	PetrolEngine p1 = ctx.getBean("pEng",PetrolEngine.class);
	
	System.out.println(p==p1);
	
	
	System.out.println(v.hashCode()+" "+v1.hashCode());
	System.out.println(v==v1);
	System.out.println("=================================");
	v.journey("jaunpur", "new delhi");
	ctx.close();	
	}
	
}
