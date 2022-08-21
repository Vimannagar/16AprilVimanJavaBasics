package stringclass;

public class AddIndividualNumberFromString {
	
	public static void main(String[] args) {
		
		String s = "as1d5ds78lk9jf";
		String ss = "";
		int sum = 0;
		for(int i=0;i<s.length(); i++ )
		{
			char c = s.charAt(i);
			
			if(Character.isDigit(c))
			{
			ss = ss+c;
			
			
			int value = Integer.parseInt(ss);
			System.out.print(ss+"+");
			if(i==s.length()-1)
			{
				System.out.print("=");
			}
			sum = sum+value;
			
			ss="";
			
			}
			
		}
		
		System.out.println(sum);
		
		
		
		
	}

}
