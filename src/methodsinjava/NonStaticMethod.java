package methodsinjava;

public class NonStaticMethod {

//	non static method

	public void m5() {
		System.out.println("m5 non static method is running");
	}

	public void multiplication() {
		int i = 10;
		int j = 50;
		int k = i * j;
		System.out.println(k);
	}

	public static void main(String[] args) {

//		To execute the non static method we have to create an object

//		To create an object-- > 
//		classname variablename = new Classname();

		NonStaticMethod var1 = new NonStaticMethod();

		var1.m5();

		var1.multiplication();

		NonStaticMethod ref2 = new NonStaticMethod();

		ref2.multiplication();
		ref2.m5();
		
		NonStaticMethod2 n2 = new NonStaticMethod2();
		
		n2.m6();

	}

}
