package variables;

public class NonStaticVaraible {
	
//	syntax: data_type variable_name = value;
	
	boolean b = false;
	
	int i = 50;
	
	public static void main(String[] args) {
		NonStaticVaraible nsv = new NonStaticVaraible();
		
		System.out.println(nsv.b);//false
		
				
	}
	
	public static void m1()
	{
		NonStaticVaraible nsv = new NonStaticVaraible();	
		System.out.println(nsv.b);
		
		System.out.println(nsv.i);
				
	}
	
	public void m2()
	{
		System.out.println(i);
	}
	
	
	
	
	
	

}
