package com.nt.main;

import java.util.Arrays;

import com.nt.comps.Demo;

public class Test {

	public static void main(String[] args) {
		
		Class c1=Demo.class;
		System.out.println("Class name :"+c1.getName());
		System.out.println("SuperClass name :"+c1.getSuperclass());
		System.out.println("Constructor :"+Arrays.toString(c1.getConstructors()));
		System.out.println("Interfaces :"+Arrays.toString(c1.getInterfaces()));
		System.out.println("Varaiables :"+Arrays.toString(c1.getDeclaredFields()));
		System.out.println("Class Methods :"+Arrays.toString(c1.getMethods()));
		System.out.println("Package :"+c1.getPackageName());
		System.out.println("Sample Class Name  :"+c1.getSimpleName());
		System.out.println("Class Name With Package Name :"+c1.getTypeName());
		

	}
}
