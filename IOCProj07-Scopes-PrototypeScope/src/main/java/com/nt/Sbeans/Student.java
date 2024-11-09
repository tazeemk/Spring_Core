package com.nt.Sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("stud")
@Scope("prototype")
public class Student
{
   @Autowired
   @Qualifier("mb")
	private Branch branch;
   
   
	
   public Student() {
  
	   System.out.println("Student :0 param Contructor :");
}



public String getCourse(String ctype) {
	   if(ctype.equalsIgnoreCase("mca"))
	        return  branch.choseBranch();
	   else if(ctype.equalsIgnoreCase("mba"))
	      return branch.choseBranch();
	   else if(ctype.equalsIgnoreCase("m_tech"))
		   return branch.choseBranch();
	   else
		    throw new IllegalArgumentException("Invalid Data :");
   }
   
	
}
