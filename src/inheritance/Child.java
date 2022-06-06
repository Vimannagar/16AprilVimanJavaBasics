package inheritance;

public class Child extends Parent {

	public void bike()
	{
		System.out.println("bike method");
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.bike();
		
		c.home();
		
		c.car();

		c.property();
		
		capital();
		
		c.farm();
	}
}
