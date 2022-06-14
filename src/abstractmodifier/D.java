package abstractmodifier;

public class D extends C{

	
	public void emailService() {
		System.out.println("email service");
		
	}
	
	public static void main(String[] args) {
		D d = new D();
		
		d.login();
		
		d.profileCreation();
		
		d.profileUpdation();
		
		d.submit();
		
		d.emailService();
				
	}

}
