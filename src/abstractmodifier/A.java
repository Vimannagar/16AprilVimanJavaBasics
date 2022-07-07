package abstractmodifier;

public abstract class A {
	
	public A()
	{
		System.out.println("Abstract class A constructor");
	}
	
	public void login()
	{
		System.out.println("Login to application");
	}
	
	public void submit()
	{
		System.out.println("Submit the profile");
	}
	
	public void profileUpdation()
	{
		System.out.println("profile updation");
	}
	
	
	public static void m10()
	{
		System.out.println("static method m10 from A class");
	}
	
	
	public abstract void profileCreation();
	
	public abstract void emailService();


	
	public static void main(String[] args) {
		m10();
	}
}
