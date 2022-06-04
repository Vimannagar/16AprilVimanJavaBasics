package constructor;

public class Test {
	//constructor
	public  Test()
	{
		this(80);		
		System.out.println("zero argument constructor");
		
	}
	
	
	public  Test(int i)
	{
		this(45, "abc");
		System.out.println("the value is "+i);
		System.out.println("one argument constructor");
	}
	
	public  Test(int i, String s)
	{
		System.out.println("one argument constructor");
	}
	
	
	
	public static void m1()
	{
		Test t = new Test();
		
	}
	
	public  void m2()
	{
		Test t = new Test();
		
	}
	
	public static void main(String[] args) {
		
		
		Test t = new Test();
		
		Test t1 = new Test();
		m1();
		
		
		t1.m2();
		
//		calling of one argument constructor
		Test t2 = new Test(20);
		
		Test t3 = new Test(78, "abc");
		
		
	}

}
