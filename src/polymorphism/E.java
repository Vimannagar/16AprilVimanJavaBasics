package polymorphism;

public class E extends D {
	
	int i = 20;
	
	static String s = "Mumbai";
	
	public static void main(String[] args) {
		
		E e = new E();
		
		System.out.println(e.i);//20- Child class
		
		System.out.println(s);//Mumbai - Child class
		
		D d = new D();
		
		
		System.out.println(d.i);//10 -- Parent class
		System.out.println(d.s);// Pune -- Parent class
		
		
		D dd = new E();
		
		System.out.println(dd.i);//10
		
		System.out.println(dd.s);//Pune
		
	}

}
