package categoriesofmethod;

public class WithReturnAndWithArgument {

	public boolean compare(int i)
	{
		boolean m = i>10;
		
		
		return m;
	}
	
	
	public static void main(String[] args) {
		
		WithReturnAndWithArgument wrwa = new WithReturnAndWithArgument();
		
		
		boolean returnedvalue = wrwa.compare(5);
		
		System.out.println(returnedvalue);// false
		
		
		boolean retvalue2 = wrwa.compare(20);
		
		System.out.println(retvalue2);// true
	}
	
	
	
	
	
}
