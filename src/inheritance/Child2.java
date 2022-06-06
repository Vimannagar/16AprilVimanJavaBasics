package inheritance;

public class Child2 extends Parent{
	
	public void jeep()
	{
		System.out.println("Jeep method from Child2");
	}
	
	public static void main(String[] args) {
		
		
		Child2 c2 = new Child2();
		
		c2.jeep();
		
		c2.home();
		
		c2.property();
		
		
		
	}

}
