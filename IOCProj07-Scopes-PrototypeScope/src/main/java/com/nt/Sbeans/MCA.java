package com.nt.Sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Lazy
@Component("mc")
public class MCA implements Branch {

	@Override
	public String choseBranch() {
		System.out.println("Master of Computer Application After doing this course you will become Software Developer :");
		return " Eligiblity for this course in 12 pass with math,chemistry,Physics and Biology :";
	}

	public MCA() {
	System.out.println("MCA : 0 param Constructor ");
	
	}

	
}
