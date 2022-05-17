package methodsinjava;

public class StaticMethodDisc {
	
	
	
//	Syntax of static method: 
	
	
//	access_modifier static returntype nameofmethod()
//	{
//		
//	}

	public static void main(String[] args) {
		printHello();
		m1();
		m1();
		
		StaticMethod2.methodOne();
		
		m1();
		
		StaticMethodDisc.m1();
		
	}
	
	public static void m1()
	{
		int i =10;
		int j = 20;
		
		int k = i+j;
		
		System.out.println(k);
	}
	
	
	public static void printHello()
	{
		System.out.println("Hello");
		System.out.println("Hello");
	}
	
	
	
	
	
	
	
}
