package arraysdiscussion;

import java.util.Arrays;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		int [] a = new int[5];
		
		a[0]= 20;
		a[1]= 10;
		a[2]= 5;
		a[3]= 90;
		a[4]= 300;
		
		Arrays.sort(a);
		
		
		System.out.println(a[a.length-2]);
		
	}

}
