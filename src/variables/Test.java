package variables;

public class Test {
	
	int i =50;
	
	int j= 20;
	
	static int k = 70;
	
	static int l = 90;
	
	
		public static void main(String[] args) {
			
		Test t = new Test();
		System.out.println(t.i);//50
		
		t.i = 10;
		
		System.out.println(t.i);//10
		
		
		Test t1 = new Test();
		
		System.out.println(t1.i);//50
		
		t.j = 40;
		
		System.out.println(t1.j);//20
		
		System.out.println(k);//70
		
		System.out.println(t1.k);//70
		
		t1.k=90;
		
		System.out.println(t.k);//90
		
		k=100;
		System.out.println(t.k);
		System.out.println(t1.k);
		
		Test t2 = new Test();
		
		System.out.println(t2.k);//100
		
		
		
	}

}
