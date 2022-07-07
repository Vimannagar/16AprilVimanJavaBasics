package casting;

public class Child extends Parent {
	
	public void m3()
	{
		System.out.println("m3 method from child");
	}

	
	public void m4()
	{
		System.out.println("m4 method from child");
	}
	
	public void m5()
	{
		System.out.println("m5 method from child");
	}
	
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		Parent pp = (Parent)c;// Up casting
		
		
		pp.m1();// parent class m1 method
		
		
		pp.m5();// child class m5 method
		
		
		Child ccc = (Child)pp;
	
		ccc.m1();// parent class m1 method
		
//		Parent p = new Parent();
//		
//		Child cc = (Child)p;// Down casting
			
//		cc.m1();//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
