package arraysdiscussion;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		String [] a = new String[6];
		
		a[0] = "sachin";
		a[1] = "saurav";
		a[2] = "rahul";
		a[3] = "dinesh";
		a[4] = "rohit";
		a[5] = "prithvi";
		
		
		System.out.println(a[2]);//rahul
		
		for(int i=0; i<6; i++ )
		{
			System.out.println(a[i]);
		}
		
		
		int size = a.length;
		
		System.out.println(size);//6
		
		
		
		
		for(int j=0; j<size; j++)
		{
			System.out.println(a[j]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
