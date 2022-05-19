package methodsinjava;

public class A {
//	Calling of non static method into another non static method
	public void m1()
	{
		System.out.println("m1 method");
	}
	
	public void m2()
	{
		B b =new B();
		b.m3();
		System.out.println("m2 method");
	}
	
	
	public static void main(String[] args) {
		A a = new A();
		a.m2();
		
		
	}

}
