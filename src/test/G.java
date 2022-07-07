package test;

import accessmodifiersdisc.F;

public class G extends F {
	
	public static void main(String[] args) {
//		Accessing protected method from F class
		
			F f = new F();
			
//			f.m1(); method m1 and m2 cannot be accessible here as they are protected
//			
//			f.m2();
		
			G g =new G();
			
			g.m1();
			
			g.m2();
			
		
			F.m3();// for static method we dont require object hence protected restrictions are not applicable to static methods.
			
//			Accessing protected variable from F class
//			System.out.println(f.d); d cannot be accessible as it is protected which can only be called inside the child class and call only by child class reference variable.
			
			System.out.println(g.d);//45.56
			
			System.out.println(i);//static protected variable for which rules are not restricted.
			
			
		
	}

}
