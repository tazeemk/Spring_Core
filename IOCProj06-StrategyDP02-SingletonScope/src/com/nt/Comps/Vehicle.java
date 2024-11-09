package com.nt.Comps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("veh")
@Scope("singleton")
public final class Vehicle
{
      @Autowired
      @Qualifier("pEng")
	private IEngine engine;
	
Vehicle(){
	System.out.println("Vehicle.Vehicle()");
}
	
	public void  journey(String sor,String des){
		     engine.startEngine();;
		System.out.println("Engine Starts from :"+sor);
		
		System.out.println("Journey Is goining On :");
		
		System.out.println("Reach to Destination :"+des);
		
		
		engine.stopEngine();
		
	}
	
	
	
	
}
