package polymorphism;

public class Overloading {
	
	
	public void m1(int i, String s)
	{
		System.out.println("two argument method");
	}
	
	public void m1(String s, int i)
	{
		System.out.println("two argument method");
	}
	
	public void m1(int o)
	{
		System.out.println("one argument method");
	}
	
	
		public static void m1(String s)
		{
			System.out.println("static method with one argument");
		}
		
		public static int m1(String d, String e)
		{
			System.out.println("static method with return type");
			
			return 80;
		}
		
		
	private	static int m1()
		{
			System.out.println("static method with return type");
			
			return 80;
		}
		
	
	public static void main(String[] args) {
		Overloading o = new Overloading();
		
		o.m1(56);
		
		o.m1(78, "abc");
		
		m1("def");
		
		A.main(args);
		
		A.main();
		
		A.main(60);
		
		
	}


}
