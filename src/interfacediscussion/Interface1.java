package interfacediscussion;

public interface Interface1 {
	int i = 80;
	
	
	
	public static final int u = 20;
	
	public String s = "abc";
	
	public abstract void m1();
	
	
	public void m2();
	
	
	void m3();
	
	
	public static void m10()
	{
		System.out.println("static m10 method inside interface 1");
	}
	
	public static void main(String[] args) {
		
		
		m10();
		Interface1.m10();
	}
	
	
	}
