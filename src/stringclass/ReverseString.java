package stringclass;

public class ReverseString {
	
	
	public static void main(String[] args) {
		String s = "abcdef";
		
		String reverse= "";
		
		int size = s.length();
		
		int lastindex = size-1;
		
		
		for(int i= lastindex; i>=0; i--)
		{
			reverse = reverse+ s.charAt(i);
		}
		
		System.out.println(reverse);//fedcba
		
		
	}

}
