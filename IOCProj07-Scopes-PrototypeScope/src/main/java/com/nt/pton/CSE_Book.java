package com.nt.pton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class CSE_Book 
{

	private static  CSE_Book INSTANCE;
	
	
      public static CSE_Book getInstance() {
		
		if(INSTANCE==null) 
			INSTANCE = new CSE_Book();
			return INSTANCE;
		
		
	}
	

}
