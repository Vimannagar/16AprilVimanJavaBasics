package constructor;

public class Test {
	//constructor
	public  Test()
	{
		System.out.println("constructor is running");
	}
	public  Test(int i)
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
		
		
	}

}
