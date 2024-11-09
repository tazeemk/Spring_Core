
  package com.nt.main;
  import org.springframework.context.annotation.AnnotationConfigApplicationContext; 
  import com.nt.config.AppConfig; //
  import com.nt.sbeans.WishMessageGenerator;
  
  public class DependencyInjectionTest { public static void main(String[] args)
  {
 System.out.println("DependencyInjectionTest.(start");
  AnnotationConfigApplicationContext ctx = new
  AnnotationConfigApplicationContext(AppConfig.class);
  
  WishMessageGenerator obj = ctx.getBean("wmg",WishMessageGenerator.class); //WishMessageGenerator ms =(WishMessageGenerator)obj;
  
             String result= obj.generator("Devang");
  // String Restult = ms.generator("Devang");
          System.out.println("Result :"+result);
  //System.out.println("DependencyInjectionTest:(End)"); ctx.close();
  
  }
  
  }
 