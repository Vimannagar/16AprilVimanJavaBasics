package revision;

public class ForLoop {
	
//	syntax: 
//	   1					2,5,8,11			4, 7, 10
//for(any javastatement; boolean_condition; any java statement)
//{
//	3, 6, 9, 12
//	actions
//	
//}
//
	public static void main(String[] args) {
		int j [] = new int [5];
		
		for(int i =0; i<5; i++)
		{
			System.out.println("Value of i is :"+i);
			
			j[i] = i*2;
			
			
		}
		
		for(int k=0; k<5; k++)
		{
			System.out.println(j[k]);
		}
		
		
		for(int ii:j)
		{
			System.out.println(ii);
		}
	}
	

}
