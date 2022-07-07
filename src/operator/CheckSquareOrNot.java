package operator;

public class CheckSquareOrNot {
	
	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 10;
		int c = 11;
		int d = 10;
		
	boolean cond1 =	a==b; 
	
	boolean cond2 = c==d;
	
	boolean cond3 = b==c;
	
	if(cond1 && cond2 && cond3)
	{
		System.out.println("it is square");
	}
	else
	{
		System.out.println("Not a square");
	}
	
	if(a==b && c==d && b==c)
	{
		System.out.println("it is square");
	}
	else
	{
		System.out.println("Not a square");
	}
		
		
		
	}

}
