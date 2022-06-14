package encapsulation;

public class Server {
	
	
	private	int customerbal = 50000;
	
	
	
	
	public void getBalance(int pin)
	{
		if(pin ==1234)
		{
			System.out.println("Your balance is : Rs."+customerbal);
		}
		else
		{
			System.out.println("Entered incorrect pin please try again");
		}
	}
	
	public int setBalance(int Amount)
	{
		if(Amount <= customerbal)
		{
			customerbal = customerbal - Amount;
			
		}
		else
		{
			System.out.println("Insufficient balance please the amount");
		}
		
		return customerbal;
		
	}
	

	

}
