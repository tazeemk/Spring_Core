package com.nt.Test;

import com.nt.Comps.Vehicle;
import com.nt.VehicleFacoty.factory;

public final class Chech 
{

	public static void main(String[] args) {
		
		Vehicle vehicle =factory.getInstance("electricengine");
		vehicle.journey("jaunpur", "new delhi");
		
	}
	
}
