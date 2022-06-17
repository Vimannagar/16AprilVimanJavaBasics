package exceptionhandling;

public class ParentExceptionUsage {
	
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
		
		catch(ClassCastException e)
		{
			String message = e.getMessage();
			
			System.out.println(message);
			
			System.out.println("Handled the exception using Catch block");
			
			
		}
		
		
		
		catch(RuntimeException e)
		{
			System.out.println("Runtime exception catch block gets execute");
		}
		
		catch(Exception e)
		{
			System.out.println("Exception exception catch block gets execute");
		}
		
		catch (Throwable e) {
			
			System.out.println("Throwable catch block");
		}
		
		
		
		
		
		
		
	}

}
