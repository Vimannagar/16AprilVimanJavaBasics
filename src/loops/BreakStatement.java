package loops;

public class BreakStatement {
	
	
	public static void main(String[] args) {
		
		for(int j=0; j<=10; j++)
		{
		for(int i=0; i<=10; i++)
		{
			System.out.println(i);
			
			if(i==7)
			{
			break;
			}
		}
		System.out.println("outside the inner loop");
		}
		
	}

}
