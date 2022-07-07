package operator;

public class RangeIdentifier {
	
	public static void range(int a)
	{
		if(a>=0 && a<=20)
		{
		System.out.println("a is between 0 to 20");
		System.out.println(a);
		}
		
		else if(a>20 && a<41)
		{
			System.out.println("a is between 21 to 40");
			System.out.println(a);
		}
		
		else if(a>100)
		{
			System.out.println("a is beyond 100");
			System.out.println(a);
		}
		if(a>10)
		{
			System.out.println("lower if is running");
		}
		
	}
	
	public static void main(String[] args) {
		range(160);
	}

}
