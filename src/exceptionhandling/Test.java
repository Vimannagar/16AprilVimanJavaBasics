package exceptionhandling;

public class Test {
	
	public static void main(String[] args) {
		
		int k=0;
		System.out.println("first line of code");
		
		int i = 10;
		int j = 0;
		try {
		System.out.println("inside try block");	
		 k = i/j;
		 
		 System.out.println("After calculating k value");
		}
		
		catch (NullPointerException r)
		{
			System.out.println("null pointer exception");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception arrived inside the catch block");
			k = 50;
		}
		
		System.out.println(k);
		
		System.out.println("second line of code");
	}

}
