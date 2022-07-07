package revision;

public class B extends A{
	
	public static void m1()
	{
		System.out.println("Static m1 method from B class");
	}
	
	
	public void m2()
	{
		System.out.println("Non Static m2 method from B class");
	}
	
	public static void main(String[] args) {
		
		A a = new B();
		
		
		
		a.m1();//Parent class A class---> Method hiding 
		
		a.m2();// Child class method will execute 
		
		
		int i = 50;
		
		Object j = "abc";
		
				
	}

}
