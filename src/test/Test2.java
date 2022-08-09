package test;

public class Test2 {

	
public static void main(String[] args) {
	
	int [] a = new int[5];
	
	a[0]= 60; 
	a[1]= 20; 
	a[2]= 80; 
	a[3]= 10; 
	a[4]= 5; 
	
	
	int temp;
	for(int i=0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]>a[j])
			{
				temp= a[j];
				
				a[j]= a[i];
				
				a[i]= temp;
				
			}
		}
	}
	System.out.println(a[a.length-2]);
	
	
	for(int aa:a)
	{
		System.out.println(aa);
	}
	
}
	
	
	
}
