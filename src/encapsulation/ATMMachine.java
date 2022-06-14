	package encapsulation;
	
	
	
	public class ATMMachine {
		
		
		public static void main(String[] args) {
			
			Server s = new Server();
			
			s.getBalance(1234);
			
			s.setBalance(60000);
			
			s.getBalance(1234);
			
		}
	}
