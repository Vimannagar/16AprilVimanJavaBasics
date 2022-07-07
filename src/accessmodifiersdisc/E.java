package accessmodifiersdisc;

public class E {
	
	
	public void m1()
	{
		System.out.println("public m1 method from E class");
	}

	
	void m2()
	{
		System.out.println("m2 default method from E class");
	}
	
	private static void m3()
	{
		System.out.println("Private m3 method from E class ");
	}
	
	public static void main(String[] args) {
		m3();
	}
	
	
}
