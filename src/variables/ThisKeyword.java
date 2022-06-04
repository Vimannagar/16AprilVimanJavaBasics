package variables;

public class ThisKeyword {
	
	
	int i =20;
	
	static char c = 'f';
	
	
	public  void m1()
	{
		int i =50;
		
		char c = 'h';
		
		System.out.println(i);//50
		
		System.out.println(this.i);//20
		
		System.out.println(c);//h
		
		System.out.println(this.c);//f--> but this way is not recommended
		
		System.out.println(ThisKeyword.c);// f- this is recommended way
		
	}
	
	public static void m2()
	{
		int i = 90;
		
		System.out.println(i);//90
		
//		System.out.println(this.i);// as this is static area hence we cannot use'this' keyword
		
		ThisKeyword tk = new ThisKeyword();
		System.out.println(tk.i);//20
		
	}
	
	public static void main(String[] args) {
		
		
		ThisKeyword tk = new ThisKeyword();
		tk.m1();
		System.out.println("*************************************************");
		m2();
		
	}

}
