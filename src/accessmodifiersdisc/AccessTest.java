package accessmodifiersdisc;

public class AccessTest {
	
	public static void main(String[] args) {
//		Accessing the public class A
		A.m1();
		
		A a = new A();
		
		a.m2();
		System.out.println("**************************************");
//		Accessing the <default> class B
		
		
		B.m3();
		
		B b = new B();
		
		b.m4();
		
		System.out.println("**************************************");
//		Accessing the public final class C
		
		C.m5();
		
		C c = new C();
		
		c.m6();
		
		System.out.println("**************************************");		
//		Accessing the public method from Class E
		
		E e = new E();
		
		e.m1();
		
//		Accessing the default method from E class
		
		e.m2();
		
//		Accessing the private method from E class	
		
//		E.m3();// we cannot access m3 outside the class as it is private
		System.out.println("**************************************");	
//	Accessing protected method from F class
		
		F f = new F();
		
		f.m1();
		
		f.m2();
		
		F.m3();
		
		System.out.println("*********************************************");
		
//		Accessing the public variable from A class
		
		System.out.println(a.i);
		
//		Accessing the default variable from A class
		
		System.out.println(A.s);
		
//		Accessing the protected variable from A class
		
		System.out.println(a.c);
		
		
		
		
	}

}
