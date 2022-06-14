package abstractmodifier;

public  abstract class A {
	
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
	
	public abstract void profileCreation();
	
	public abstract void emailService();


}
