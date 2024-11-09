package com.nt.Comps;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("eEngine")
@Lazy(true)

public final class ElectricEngine implements IEngine { 
  ElectricEngine(){
	  System.out.println("ElectricEngine.ElectricEngine()");
	  
  }
	
	
	
	@Override
	public void startEngine() {
	System.out.println("Electric Engine Starts");	
	}
    @Override
	public void stopEngine() 
	{
	System.out.println("Electric Engine Stops ");	
	}
	
	
}
