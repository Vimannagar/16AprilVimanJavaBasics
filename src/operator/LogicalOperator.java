package operator;

public class LogicalOperator {
	
	
	public static void main(String[] args) {
		// 1. AND operator
		
		
		char c = 'a';
		
		
		char d = 'a';
		
		int i = 50;
		
		int  j = 50;
		
		boolean e = c==d;
		
		System.out.println(e);//true
		
	boolean	k = i!=j;
	
	System.out.println(k);// false
	
	
	boolean f = e && k;
	
	System.out.println(f);// true
	
	
//	WAP to check whether the given dimensions are representing square or not
	
	
	
	// 2. OR operator
	int z = 10;

	int y = 20;

	boolean g = z<y;
	
	boolean h = y>50;
	
	
	boolean m = g || h;
	
	System.out.println(m);//true
	
	
//	3. NOT operator
	
	boolean n = false;
	
	boolean o = !n;
	
	System.out.println("n value is "+o);
	
	if(!(z<y))
	{
		System.out.println("if is executing");
	}
	else
	{
		System.out.println("else is executing");
	}
	
	
	}
	
	

}
