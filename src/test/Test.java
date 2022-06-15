package test;

import interfacediscussion.Interface1;

public class Test {
	
	public static void main(String[] args) {
		
		
		System.out.println(Interface1.i);
		
//		Interface1.i = 90;-->we get error here as we cannot reinitialize final variable 
	}

}
