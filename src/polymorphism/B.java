package polymorphism;

public class B {
	
	
	public void m1()
	{
		System.out.println("zero arg Parent class m1 method");
	}
	
	
	public void m1(int i)
	{
		System.out.println("one arg Parent class m1 method");
	}
	
	
	public static void main(String[] args) {
		
		B b  = new B();
		
		b.m1();
		
		b.m1(50);
		
		
	}


}
