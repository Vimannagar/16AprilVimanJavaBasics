package exceptionhandling;

public class TryCatchRules {
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		int k = 0;
		try {
		System.out.println("inside try block");	
		 k = i/j;
		 
		 System.out.println("After calculating k value");
		}
				
		catch(NullPointerException e)
		{
			System.out.println("catch block");
		}
		
		catch(ArithmeticException e)
		{
			String message = e.getMessage();
			
			System.out.println(message);
			
			System.out.println("Handled the exception using Catch block");
			
			
		}
		
	}

}
