package exceptionhandling;

public class Test4 {
	Test3 t3;
	
	public void m2()
	{
		t3.m1();
	}
	
	
	public static void main(String[] args) {
		Test4 t4 = new Test4();
		
		t4.m2();
	}

}
