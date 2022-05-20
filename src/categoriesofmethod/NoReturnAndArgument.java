package categoriesofmethod;

public class NoReturnAndArgument {
	
	
	public static void m1(int a)
	{
		System.out.println("method with no return and with argument");
		
		System.out.println("The value of argument is "+a);
	}
	
	
	public void m2(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}

	
	public static void main(String[] args) {
		
		m1(50);
		
		m1(20);
		
		NoReturnAndArgument nra = new NoReturnAndArgument();
		nra.m2(40, 89);
		nra.m2(10, 20);
		
		
	int k	= WithReturnAndNoArgument.m1();
	
	m1(k);
		
//	WAP for calculator in which we can perform addition, multiplication, substraction and division
		

	}
	
	
}
