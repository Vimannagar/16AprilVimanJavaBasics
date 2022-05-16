package datatypes;

public class NonPrimitiveDataType {

	
	public static void main(String[] args) {
		String s = "This is String value";
		
		System.out.println(s);//This is String value
		
		
		System.out.println("String"+" "+"value");

		// + is known as concatenation operator when it is used for String. Which is used to join the values
		
		
	
		
		System.out.println("Statement :"+s);//Statement :This is String value
		
		String s1 = "abc";
		String s2 = "def";
		System.out.println(s1+s2);//abcdef
		
		System.out.println(s1+50);//abc50
		
		System.out.println(s2+2+2);//def22
		
		System.out.println(2+2+s2);//4def
		
		
		int i = 50;
		int j = 20;
		int k = i+j;
		System.out.println("The sum is :"+k);//The sum is :70
		
		
		System.out.println(5+5);//10
		
		System.out.println("5"+5);//55
		
		
	}
}
