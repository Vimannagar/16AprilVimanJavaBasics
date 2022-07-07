package interfacediscussion;

public  class A implements Interface1, Interface2 {

	
	
	
	public void m1() {
		System.out.println("m1 method from A class");
	}

	
	public void m2() {
		
		System.out.println("m2 method from A class");
	}


	
	public void m3() {
		
		System.out.println("m3 method from A class");
	}

	public static void main(String[] args) {
		A a = new A();
		
		a.m1();
		
		a.m2();
		
		a.m3();
	}


	
	public void m4() {
		// TODO Auto-generated method stub
		
	}


	
	public void m5() {
		// TODO Auto-generated method stub
		
	}


	
	
	
}
