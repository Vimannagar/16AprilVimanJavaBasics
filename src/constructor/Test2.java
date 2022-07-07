package constructor;

public class Test2 {
	
	public  Test2()
	{
		this(80);		
		System.out.println("zero argument constructor");
		
	}
	
	
	public  Test2(int i)
	{
		this(45, "abc");
		System.out.println("the value is "+i);
		System.out.println("one argument constructor");
	}
	
	public  Test2(int i, String s)
	{
		System.out.println("two argument constructor");
	}
	
	public static void main(String[] args) {
		
		Test2 t = new Test2();
	}

}
