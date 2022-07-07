package categoriesofmethod;

public class WithReturnAndNoArgument {
	
	
	
	
	
	public static void main(String[] args) {
		
		int h = m1();
		
		System.out.println(h);
		System.out.println(h+2);
		
		
		String value = m2();
		
		System.out.println(value);//DanielEder
		
		System.out.println("*********************************************");
		
		int rollvalue = rollGenerator();
		
		
		actualRollNumber(rollvalue);
		
		
		
	}
	
	
	
	public static int m1()
	{
		int i = 50;
		int j = i+2;
		
		System.out.println(j);
	
		return j;
		
		
		}
	
	
	public static String m2()
	{
		String p1 = "Daniel";
		String p2 = "Eder";
		
		String team = p1 + p2;
		
		
		return team;
	}
	
	
	
	public static int rollGenerator()
	{
		int value = 10;
		
		int rollnum = value +1;
		
		
		return rollnum;
		
	}
	
	public static void actualRollNumber(int retvalue)
	{
		String actualnum= retvalue +"A Section";
		
		System.out.println(actualnum);
	}
	
	
	
	
	
	
	
	
	
	

}
