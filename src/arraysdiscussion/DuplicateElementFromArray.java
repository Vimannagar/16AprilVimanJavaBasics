package arraysdiscussion;

public class DuplicateElementFromArray {
	
	public static void main(String[] args) {
		int [] a = {2, 1, 2, 5, 1};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
				
			}
			
			
			
		}
	}


}
