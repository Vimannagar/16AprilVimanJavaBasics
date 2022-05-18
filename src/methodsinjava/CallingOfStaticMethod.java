package methodsinjava;

public class CallingOfStaticMethod {

	
	public static void m1()
	{
		System.out.println("m1 method");
	}
	
	public static void m2()
	{
		System.out.println("m2 method");
		m1();
		CallingOfStaticMethod.m1();
		
	}
	
	public static void main(String[] args) {
		m2();
		
	}
	
	
}
