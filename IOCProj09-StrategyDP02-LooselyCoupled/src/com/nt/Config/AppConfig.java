package com.nt.Config;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.nt.Comps")
public class AppConfig{
public AppConfig() {
System.out.println("AppConfig.AppConfig()");
}
}
