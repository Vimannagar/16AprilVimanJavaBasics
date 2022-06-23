package stringclass;

public class Definition {
	
	
	
	public static void main(String[] args) {
		
		String s = "abc";
		
		String ss = new String("abc");
		
		ss.concat("def");	
		
		
		System.out.println(s);// abc ---> immutable
		
		
		StringBuffer sb = new StringBuffer("abc");
		
		
		sb.append("def");
		
		System.out.println(sb);// abcdef---> mutable
		
	
		
		
		
	}
	
	

}
