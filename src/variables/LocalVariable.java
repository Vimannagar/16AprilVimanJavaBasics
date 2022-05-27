package variables;

public class LocalVariable {
	int i =50;// non static variable
	static boolean b;// static variable
	
	public static void main(String[] args) {
		
//		local variable
		int j = 10;
		
//		int k;
//		
//		System.out.println(k);
		
		
		
	}
	
	public static void m1()
	{
		// local variable
		String s = "abc";
		
	System.out.println(s);
	}
	
	
	
	public  void m2()
	{
		// local variable
		String s = "jkl";
		
		System.out.println(s);//jkl
	}
	
	
	public void m3(int i, int j)
	{
		// here i and j are local variable
		System.out.println(i);
		System.out.println(j);
	}

}
