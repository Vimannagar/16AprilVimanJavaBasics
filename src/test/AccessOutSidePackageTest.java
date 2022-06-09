package test;

import accessmodifiersdisc.A;
import accessmodifiersdisc.C;
import accessmodifiersdisc.E;

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
		
		System.out.println("**************************************");		
//		Accessing the public method from Class E
		
		E e = new E();
		
		e.m1();
		
//		e.m2();- It can only be accessible within the package but not outside the package
		
//		Accessing the public variable from A class
		
		System.out.println(a.i);
		
//		Accessing the default variable from A class
		
//		System.out.println(A.s);s variable is not accessible as it is default so it can be accessible with inthe package only.
		
		
		
		
	
	}

}
