package com.nt.Sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Lazy
@Component("mt")
public class M_Tech implements Branch {

	public String choseBranch() {
		System.out.println("Egibility Crieteria is B.Tech ");
		return "This course is for Techinal,Mechinal,Electrical Person :";
	}

	public M_Tech() {
		System.out.println("M_Tech: 0 param Contructor ");
	}
	
	
}
