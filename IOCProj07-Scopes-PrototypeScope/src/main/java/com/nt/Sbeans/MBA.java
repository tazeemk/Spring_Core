package com.nt.Sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Lazy
@Component("mb")

public class MBA implements Branch {

	@Override
	public String choseBranch() {
		
		System.out.println("Eligibility Crieteria for this course is 12 with Commerece :");

		return "Master in Business Analytics After doing this course you will become Dalal";
	}

	public MBA() {
	
		System.out.println("MBA : 0 param Contructor :");
	}
	

}
