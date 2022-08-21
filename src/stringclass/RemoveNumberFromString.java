package stringclass;

public class RemoveNumberFromString {
	
	public static void main(String[] args) {
		
		
		String s = "bjsjdjsajdsaj54s5dsamslkdjsa45dsadsa";
		String alphabeticString = "";
		
		for(int i=0;i<s.length(); i++ )
		{
		char	c= s.charAt(i);
		
		if(Character.isDigit(c))
		{
			continue;
		}
		else
		{
			alphabeticString = alphabeticString+c;
		}
		
		
		}
		
		System.out.println(alphabeticString);
		
	}

}
