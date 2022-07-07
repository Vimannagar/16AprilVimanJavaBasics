package inheritance;

public class Parent extends GrandParent{
	static int parstatvariable = 40;
	int cars = 2;
	
	int parentvariable = 50;
	
	public void home()
	{
		System.out.println("Home method");
	}
	
	public void car()
	{
		System.out.println("car method");
	}
	
	public void property()
	{
		System.out.println("property method");
	}
	
	public static void capital()
	{
		System.out.println("Capital static method");
	}
	
	
	public static void main(String[] args) {
		capital();
		
		Parent p = new Parent();
		
//		p.bike();--> this is not valid as Child has extented to parent.
		
		Child c = new Child();
		
		c.bike();
		
		p.farm();
		
	
		
	}
	

}
