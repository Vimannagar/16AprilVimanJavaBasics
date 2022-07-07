package operator;

public class OddEvenCheck {
	
	public static void evenOrOdd(int a)
	{
	int b =  a%2;
	
	
	if(b==0)
	{
		System.out.println("Number "+a+" is an even number");
	}
	else {
		System.out.println("Number "+a+" is an odd number");
	}
	
	}
	
	
	public static void main(String[] args) {
		evenOrOdd(5);
		evenOrOdd(6);
	}

}
