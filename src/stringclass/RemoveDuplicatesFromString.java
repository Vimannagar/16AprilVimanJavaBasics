package stringclass;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
	
	public static void main(String[] args) {
		
		String s = "abcdefabcdef";
		
		String uniquestr = "";
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(!(hs.contains(c)))
			{
				hs.add(c);
				System.out.print(c);
				
				uniquestr= uniquestr+c;
				
			}
		}
		System.out.println();
		System.out.println("String having no duplicate is: "+uniquestr);
		
	}

}
