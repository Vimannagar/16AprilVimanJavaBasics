package variables;

public class NonStaticVaraible {
	
//	syntax: data_type variable_name = value;
	
	boolean b = false;
	
	public static void main(String[] args) {
		NonStaticVaraible nsv = new NonStaticVaraible();
		
		System.out.println(nsv.b);//false
		
				
	}
	
	public static void m1()
	{
		NonStaticVaraible nsv = new NonStaticVaraible();	
		System.out.println(nsv.b);
	}
	
	

}
