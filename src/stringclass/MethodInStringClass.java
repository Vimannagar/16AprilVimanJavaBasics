package stringclass;

public class MethodInStringClass {
	
	public static void main(String[] args) {
//		equals
		
		String s1 = "abc";
		
		String s2 = "Abc";
		
		boolean s3 =  s1.equals(s2);
		
		System.out.println(s3);//false
		
//equalsIgnoreCase(String)
		
		boolean s4 = s1.equalsIgnoreCase(s2);
		
		
		System.out.println(s4);//true
		
		
//		charAt(int index)
		
		String s5 = "Bangalore city";
		
		 char s6 = s5.charAt(11);
		 
		 System.out.println(s6);//i
		 
//		 char s7 = s5.charAt(20);// StringIndexOutOfBoundException
		 
//		concat(String s)
		 
		 String s7 = "Pune";
		 
		 String s8 = " City";
		 
		 String s9 = s7.concat(s8);
		 
		 System.out.println(s9);//Pune City
		 
		 
//		 substring(int begin, int end)
		 
		 String s10 = "Aurangabad";
		 
		String s11 =  s10.substring(2, 7);
		
		System.out.println(s11);//ranga
		
		
		
//		subString(int begin)
		
		String s12 = s10.substring(2);
		
		System.out.println(s12);//rangabad
		
		
//		length();
		
		String s13 = "abcdef";
		
		int s14 = s13.length();
		
		System.out.println(s14);//6
		 
		
//		WAP to reverse the String abcdef---> fedcba
//		WAP to print only the letter present at even and odd position
//		WAP to count the occurance of a letter inside a String

//replace(char oldchar, char newchar)
		
			String s15 = "abcdefghd";
			
			String s16 = s15.replace('d', 'z');
		
			System.out.println(s16);//abczefghz
		
		
//	replace(String old, String new)
			
			String s17 = "Srinagar";
			
			String s18 = s17.replace("Sri", "Ahmed");
			
			System.out.println(s18);//Ahmednagar
			
			
//		WAP to remove the <space> from String-> "I lives in Pune";
			
			
			
//	toLowerCase()
			
	String s19 = "Pune";
		
	String s20 = s19.toLowerCase();
	
	System.out.println(s20);//pune
	
	
//	WAP to count number of occurance of a letter inside a String irrespective of their case- Ahemdabad
		
//	toUpperCase()
	
	String s21 = "Haldwani";
	
	String s22 = s21.toUpperCase();
	
	System.out.println(s22);//HALDWANI
	
	
//	trim()
	
	String s23 ="    Delhi     ";
	
	String s24 = s23.trim();
	
	System.out.println(s24);//Delhi
	
//	indexOf(char ch)
	
	String s25 = "Pennsylvania";
	
	int s26 = s25.indexOf('n');
	
	System.out.println(s26);//2
	
//	WAP to print the character and their index position inside a string.ex: a  0
	
//	indexOf(char ch)
	
int	s27 = s25.lastIndexOf('n');

System.out.println(s27);//9
	

//contains(String s)

String s28 = "Hyderabad";

boolean s29 = s28.contains("der");

System.out.println(s29);//true


//startswith(String s)

String s30 = "Singapore";

boolean s31 = s30.startsWith("Sing");

System.out.println(s31);

//endswith
 boolean s32 = s30.endsWith("re");
 
 System.out.println(s32);
 
 
 
 
	
	}

}
