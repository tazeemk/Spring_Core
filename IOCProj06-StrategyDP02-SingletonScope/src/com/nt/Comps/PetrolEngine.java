package com.nt.Comps;

import org.springframework.stereotype.Component;

@Component("pEng")
public class PetrolEngine implements IEngine {
 private PetrolEngine()
{
	System.out.println("PetrolEngine.PetrolEngine()");
	
}
	
	@Override
	public void startEngine() 
	{
		System.out.println("Petrol Engine Starts :");

	}

	@Override
	public void stopEngine() {
		System.out.println("Petrol Engine Stops :");

	}

	PetrolEngine pp= new PetrolEngine();
	
}
