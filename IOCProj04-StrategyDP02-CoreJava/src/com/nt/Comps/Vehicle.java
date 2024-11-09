package com.nt.Comps;

public final class Vehicle
{

	private IEngine engine;
	
	public void setEngine(IEngine engine)
	{
		this.engine=engine;
	}
	
	public void  journey(String sor,String des){
		     engine.startEngine();;
		System.out.println("Engine Starts from :"+sor);
		
		System.out.println("Journey Is goining On :");
		
		System.out.println("Reach to Destination :"+des);
		
		
		engine.stopEngine();
		
	}
	
	
	
	
}
