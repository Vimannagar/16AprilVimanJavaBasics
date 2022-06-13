package memorymanagement;

public class D extends E
{
	
	
	public void m10()
	{
		b.m4();
		
		a.m1();
		
		c.m9();
		
	}
	
	public void m11()
	{
		b.m4();
		
	
		
		c.m8();
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		D d = new D();
		
		d.m10();
		
		d.m11();
		
	}

}
