package exceptionhandling;

public class TryCatchFinally {
	
	public static void main(String[] args) {
		
		try
		{
			System.out.println("inside the try block");
			
			int i = 10/0;
		}
		catch(NullPointerException q)
		{
			System.out.println("Inside the catch block");
		}
		
		finally
		{
			System.out.println("Inside finally block");
		}
		
	}

}
