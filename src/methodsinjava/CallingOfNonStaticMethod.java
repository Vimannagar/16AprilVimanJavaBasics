package methodsinjava;

public class CallingOfNonStaticMethod {
	
	public static void m1()
	{
		CallingOfNonStaticMethod com = new CallingOfNonStaticMethod();
		com.m2();
		System.out.println("m1 method");
		
	}
	
	public void m2()
	{
		System.out.println("m2 non static method");
	}
	
	public static void main(String[] args) {
		m1();
	}

}
