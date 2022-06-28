package stringclass;

public class CharAtEvenPosition {
	
	public static void main(String[] args) {
		String s = "Laddakh";
		
		for(int i=0; i<s.length(); i++)
		{
			if(i%2==0)
			{
				char charvalue = s.charAt(i);
				System.out.println("At "+i+"th position char is :"+charvalue);
			}
		}
//	Output:	
//		At 0th position char is :L
//		At 2th position char is :d
//		At 4th position char is :a
//		At 6th position char is :h
		
	}

}
