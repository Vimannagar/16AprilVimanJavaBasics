package polymorphism;

public class C extends B {
	
	
	public void m1(int i)
	{
		System.out.println("one arg Child class m1 method");
	}
	
	public void m1(int i, int j)
	{
		System.out.println("C class 2 arg m1 method");
	}
	
	
	
	public static void main(String[] args) {
		
//		C c = new C();
//		
//		c.m1();
		
		B b = new C();
		
		b.m1();// parent class i.e B classi.e compile time polymorphism
		
		b.m1(50);// Child class i.e C class i.e Runtime polymorphism
		
		
		
	}

}
