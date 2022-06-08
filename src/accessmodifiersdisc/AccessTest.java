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
		
		
		
	}

}
