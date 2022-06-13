package polymorphism;

public class Parent {
	
	final int i = 50;
	
	public void home()
	{
		System.out.println("Home method");
	}
	
	public void car()
	{
		System.out.println("car method");
	}
	
	public void property()
	{
		System.out.println("property method");
		System.out.println(i);
	}
	
	public static void capital()
	{
		System.out.println("Capital static method");
	}
	
	public final void marry()
	{
		System.out.println("Marry method defined by parents for child");
	}
	
	public void farmHouse()
	{
		System.out.println("farm house method from Parent class");
	}
	
	 void m1()
	{
		System.out.println("m1 method from parent class");
	}
	 
	 public static void m2()
	 {
		 System.out.println("m2 static method from Parent class");
	 }
	
	 
		 public static void m3()
		 {
			 System.out.println("m2 static method from Parent class");
		 }
		 
		 void m4()
			{
				System.out.println("m4 method from parent class");
			} 
		 
		public final void m5()
			{
				System.out.println("m4 method from parent class");
			} 
		
		public final void m5(int i)
		{
			System.out.println("m4 method from parent class");
		} 

}
