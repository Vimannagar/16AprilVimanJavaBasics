package accessmodifiersdisc;

public class A {

public int i =50;

 static String s = "Pune";
 
 private boolean b = false;
 
 protected char c = 'a';
 
	
	public static void m1()
	{
		System.out.println("static method m1 from A class");
	}
	
	public void m2()
	{
		System.out.println("non static method m1 from A class");
	}
	
	
	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.b);
	}
	
	
	
}
