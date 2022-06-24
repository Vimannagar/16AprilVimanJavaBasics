package stringclass;

public class SCPConcept {

	
	public static void main(String[] args) {
		
		String ss = new String("abc");
		
		String ss1 = new String("def");
				
		String ss2 = new String("def");
		
		String s1 = "ghi";
		
		String s2 = "abc";
		
		String s3 = "abc";
		
		String s4 = "abc";
		
		String s5 = "ghi";
		
		
	boolean ispointingsame = s1==s5;
	
	System.out.println(ispointingsame);//true
	
	boolean ispointingsame1 = s4==ss;
	
	System.out.println(ispointingsame1);//false
		
	
	boolean iscontentequal = s4.equals(ss);
	
	System.out.println(iscontentequal);//true
		
	
	 boolean iscontequal = ss1.equals(ss2);// true
	 
	 System.out.println(iscontequal);
//		== equals
		
	}
}
