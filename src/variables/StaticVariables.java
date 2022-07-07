package variables;

public class StaticVariables {
	
//	syntax: static data_type variablename = value
	
	static int i = 65;
	
	static String s = "abc";
	
	static int j;
	static String k;
	
	public static void main(String[] args) {
		
		System.out.println(i);//65
		
		System.out.println(j);
		
		System.out.println(k);
	}
	
	public static void m1()
	{
		System.out.println(i);//65
	}
	
	public  void m2()
	{
		System.out.println(i);
	}

}
