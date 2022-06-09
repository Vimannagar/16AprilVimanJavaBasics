package accessmodifiersdisc;

public class F {
	
	protected double d = 45.56;
	
	protected static int i = 80;
	
	
	protected void m1()
	{
		System.out.println("protected m1 method from F class");
	}
	
	
	protected void m2()
	{
		System.out.println("protected m2 method from F class");
	}
	
	
	protected static void m3()
	{
		System.out.println("protected m3 static method from F class");
	}
	
	
	public static void main(String[] args) {
		
		m3();
	
		
	}

}
