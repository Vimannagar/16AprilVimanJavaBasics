package constructor;

public class B extends A{
	
	public B()
	{
		super(50);
		System.out.println("zero argument cons from B class");
	}
	
	
	public B(int i)
	{	super(10);
		System.out.println("one argument cons from B class");
	}
	
	
	public static void main(String[] args) {
		
		B b = new B();
		
		
		System.out.println("**********************************");
		
		B b1 = new B(100);
	}

}
