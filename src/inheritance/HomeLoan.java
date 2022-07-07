package inheritance;

public class HomeLoan extends Loan
{
	
	
	public void documentVerfication()
	{
		System.out.println("Document verification");
	}

	
	public void completionDocument()
	{
		System.out.println("Completion method");
	}
	
	
	public static void main(String[] args) {
		
		
		HomeLoan hl = new HomeLoan();
		
		hl.documentVerfication();
		
		hl.calculateInterestValue(7);//accessing the methods from  Loan class
		
		hl.penaltyCalculation(15);//accessing the methods from  Loan class
		
		
		
	}
}
