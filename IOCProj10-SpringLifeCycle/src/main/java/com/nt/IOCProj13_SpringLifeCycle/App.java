package com.nt.IOCProj13_SpringLifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.Config.AppConfig;
import com.nt.Service.VotingEligibility;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        
        VotingEligibility v  = ctx.getBean("ser",VotingEligibility.class);
        
        String msg = v.checkeligibility();
        
        
        System.out.println(msg);
        ctx.close();
        
        
        
        
    }
}
