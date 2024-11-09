package com.nt.Comps;

import org.springframework.stereotype.Component;

@Component("dEng")
public final class DiselEngine implements IEngine {
	DiselEngine() {
	System.out.println("DiselEngine.DiselEngine()");

}
	@Override
	public void startEngine() {
		System.out.println("Disel Engine Starts :");

	}

	@Override
	public void stopEngine() {
		System.out.println("Disel Engine Stops :");

	}

}
