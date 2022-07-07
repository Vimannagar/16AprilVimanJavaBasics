package exceptionhandling;

public class ErrorDisc {
	
	public void m1()
	{
		System.out.println("m1 method ");
		
		m2();
	}
	
	
	public void m2()
	{
		System.out.println("m2 method ");
		
		m1();
	}
	
	public static void main(String[] args) {
		ErrorDisc ed = new ErrorDisc();
		
		ed.m1();
	}

}
