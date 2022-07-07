package stringclass;

public class OccuranceCountOfALetter {

	public static void main(String[] args) {

		String s = "PhiPPPladelphiapppp";
		int count = 0;

//		for(int i=0; i<s.length(); i++)
//		{
//			
//			char charvalue = s.charAt(i);
//			
//			if(charvalue=='p' || charvalue == 'P')
//			{
//				count++;
//			}
//			
//			
//		}
//		
//		System.out.println("count value is :"+count);

//		Alternate way:

		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {

			char charvalue = s.charAt(i);

			if (charvalue == 'p') {
				count++;
			}

		}

		System.out.println("count value is :" + count);

	}

}
