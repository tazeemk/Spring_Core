package com.nt.VehicleFacoty;

import com.nt.Comps.DiselEngine;
import com.nt.Comps.ElectricEngine;
import com.nt.Comps.IEngine;
import com.nt.Comps.PetrolEngine;
import com.nt.Comps.Vehicle;

public final  class factory 
{
          private static IEngine engine=null;
	public static Vehicle getInstance(String engType){
		
		if(engType.equalsIgnoreCase("diselengine"))
		  engine = new DiselEngine();
		else if(engType.equalsIgnoreCase("petrolengine"))
		   engine = new PetrolEngine();
		else if(engType.equalsIgnoreCase("electricengine"))
		engine = new ElectricEngine();
		else 
			throw new IllegalArgumentException("Invalid Engine Name :");
	
	Vehicle vehicle = new Vehicle();
	vehicle.setEngine(engine);
	return vehicle;
	
	}
	
	
	
}
