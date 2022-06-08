package test;

import accessmodifiersdisc.A;
import accessmodifiersdisc.C;

public class AccessOutSidePackageTest {
	
	public static void main(String[] args) {
//		accessing public class A
		
		A.m1();
		
		A a = new A();
		a.m2();
		System.out.println("*******************************");

//		Accessing <default> class B
//		B.m3();--> We can access class B only with in the package as it is default
		
		System.out.println("**************************************");
//		Accessing the public final class C
		
		C.m5();
		
		C c = new C();
		
		c.m6();
	
	}

}
