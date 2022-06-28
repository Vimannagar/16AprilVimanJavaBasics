package stringclass;

public class ReverseWords {
	
	public static void main(String[] args) {
		String s = "This is a String";
		
		String[] s1 = s.split(" ");
		
		int elementcount = s1.length;
		
		int maxindex = elementcount -1;
		
		for(int i=maxindex; i>=0; i-- )
		{
			System.out.print(s1[i]+" ");
		}
//		Output:
//			String a is This 	
		
		
		
	}

}
