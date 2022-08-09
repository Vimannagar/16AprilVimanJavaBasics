package arraysdiscussion;

import java.util.Arrays;

public class MissingNumber {
	
	
	public static void main(String[] args) {
		
		int a[]= {5, 2, 1, 6, 3, 7, 9};
		
		Arrays.sort(a);//1,2,3,5,6
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]+1==a[i+1])
			{
				continue;
			}
			
			else
			{
				int missingnumber= a[i]+1;
				
				System.out.println(missingnumber);
				break;
				
			}
		}
		
		
		
//		WAP to print first 50 prime numbers / prime numbers upto 50
		
		
	}

}
