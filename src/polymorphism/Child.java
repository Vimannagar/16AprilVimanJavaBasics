package polymorphism;

	public class Child extends Parent{
		
		public void bike()
		{
			System.out.println("bike method");
		}
		
//		public void marry()
//		{
//			System.out.println("Marry method defined by child for himself");
//		}
		
		public void farmHouse()
		{
			System.out.println("Farm house method from child class");
		}
		
		
		public void m1()
		{
			System.out.println("m1 method from child class");
		}
		
		public static  void m2()
		 {
			 System.out.println("m2 static method from Child class");
		 }
		
		public static void main(String[] args) {
			
			Child c = new Child();
			
			c.home();
			
			c.bike();
			
			c.car();
			
			c.marry();
			
			c.farmHouse();// child class farmhouse
			
		
			
			Parent p = new Parent();
			
			
			p.farmHouse();// parent class farmhouse method
			
			
			
			Parent pp = new Child();
			
			pp.farmHouse();// child class farmhouse method
			
			pp.car();// parent car method
			
			
//			Child cc = new Parent(); -- This is invalid
			
			
			pp.m2();
			
			
			
			
			
			
		}
	
	}
