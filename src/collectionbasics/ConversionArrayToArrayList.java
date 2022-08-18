package collectionbasics;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionArrayToArrayList {
	
	
	public static void main(String[] args) {
		
//		Conversion of Array to ArrayList:
		
		Integer i [] = {50, 60, 10, 2, 4};
		
		
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(i));
		
		System.out.println(al);//50, 60, 10, 2, 4
		
		
		
//		ArrayList to array conversion:
		
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		al2.add(50);
		al2.add(2);
		al2.add(8);
		al2.add(20);
		al2.add(6);
		al2.add(9);
		
		Integer ii [] = new Integer[al2.size()];
		
		al2.toArray(ii);
		
		for(int d :ii)
		{
			System.out.println(d);
		}
		
		
		
		
		
	}

}
