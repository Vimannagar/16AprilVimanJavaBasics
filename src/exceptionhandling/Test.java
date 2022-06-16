package exceptionhandling;

public class Test {
	
	public static void main(String[] args) {
		
		int k;
		System.out.println("first line of code");
		
		int i = 10;
		int j = 0;
		try {
		System.out.println("inside try block");	
		 k = i/j;
		
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
