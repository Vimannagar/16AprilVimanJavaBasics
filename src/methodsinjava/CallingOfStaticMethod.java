package methodsinjava;

public class CallingOfStaticMethod {

	
	public static void m1()
	{
		System.out.println("m1 method");
	}
	
	public static void m2()
	{
		System.out.println("m2 method");
		m1();// calling of static method into static method
		CallingOfStaticMethod.m1();
		
	}
	
//	Calling of static into non static method
	
	public void m3()
	{
		System.out.println("m3 non static method");
		m1();
		CallingOfStaticMethod.m2();
		
	}
	
	
	
	public static void main(String[] args) {
	
		
		CallingOfStaticMethod csm = new CallingOfStaticMethod();
		csm.m3();
	
	}
	
	
}
