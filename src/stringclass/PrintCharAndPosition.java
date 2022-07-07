package stringclass;

public class PrintCharAndPosition {
	
	public static void main(String[] args) {
		String s = "Laddakh";
		
		for(int i=0; i<s.length(); i++)
		{
			
				char charvalue = s.charAt(i);
				System.out.println("At "+i+"th position char is :"+charvalue);
			
		}
//	Output:	
//		At 0th position char is :L
//		At 1th position char is :a
//		At 2th position char is :d
//		At 3th position char is :d
//		At 4th position char is :a
//		At 5th position char is :k
//		At 6th position char is :h
		
	}

}
