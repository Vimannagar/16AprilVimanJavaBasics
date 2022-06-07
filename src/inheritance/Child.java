package inheritance;

public class Child extends Parent {
	static int childstatvariable = 120;
	int cars = 1;
	int childvariable = 150;
	
	public void bike()
	{
		System.out.println("bike method");
		
		System.out.println(this.cars);// cars variable from child class
		
		System.out.println(cars);// cars variable from child class
		
		System.out.println(super.cars);
		
		
		
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.bike();
		
		c.home();
		
		c.car();

		c.property();
		
		capital();
		
		c.farm();
//		Accessing the variable from parent classes
		System.out.println(c.area);// area variable from GrandParent class
		
		System.out.println(c.cars);// cars variable from Child class
		
		Parent p = new Parent();
		
		System.out.println(p.cars);//cars variable from parent class
		
		System.out.println(c.grandparentvariable);
		
		System.out.println(c.parentvariable);
		
		System.out.println(c.childvariable);
	
		System.out.println(parstatvariable);//parent class variable
		
		System.out.println(grandstatvariable);// grand parent class variable
		
		System.out.println(childstatvariable);// Child class variable
	
		
	}
}
