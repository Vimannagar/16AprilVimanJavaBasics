package categoriesofmethod;

public class Test2 {
	
	public int m1(int i)
	{
		
		 i = i+3;
		System.out.println(i);
		
		
		return i;
		
	}
	
	
	public void m2(int k, int j)
	{
		int l = k*j;
		
		System.out.println(l);
	}
	
	public static void main(String[] args) {
		
		Test2 t2 = new Test2();
		
		int h = t2.m1(3);
		
		t2.m2(h, 20);
		
		
		
		
		
		
	}

}
