package exceptionhandling;

public class ThrowKeyword {
	
	public void conductClass()
	{
		String s = "Sunday";
		
		if(s=="Sunday")
		{
			throw new ArithmeticException("This message is shown deliberately");
			
		}
		else
		{
			System.out.println("Class will get conduct");
		}
	}
	
	public 	static void main(String[] args) {
		ThrowKeyword tk = new ThrowKeyword();
		
		tk.conductClass();
	}

}
