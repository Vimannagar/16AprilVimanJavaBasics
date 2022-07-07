package loops;

public class ReverseANumber {
	
	public static void main(String[] args) {
		int number = 12345;
		
		int i = number;//54321
		int reverse = 0;
	
		while(i!=0)
			
		{
		
		int remainder= i%10;//5
		
		
		
		reverse = reverse*10 + remainder;
		
		
		
		i = i/10;//1234
		
		
		}
		
		System.out.println(reverse);
		

		
		
		if(number == reverse)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
		
		
		
		
		
		
	}

}
