package stringclass;

public class CountThePatternInString {
	
	
	public static void main(String[] args) {
		
		String s = "hsddjfhkjsdhfsdkfhksdhf";//abcd, bcde, cdef//6-3=3
		int count =0;
		String pattern = "dhf";//3-1=2
		int end=3;
		String [] sarray = new String[s.length()-2];
		
		for(int start=0; end<=s.length(); end++)
		{
		
		String s1= s.substring(start, end);
		
		sarray[start]= s1;
		start++;
		
		}
		
		for(int i=0; i<sarray.length; i++)
		{
			if(sarray[i].equals(pattern))
			{
				count = count+1;
			}
		}
		
		System.out.println(count);
		
		
		
		
	}

}
