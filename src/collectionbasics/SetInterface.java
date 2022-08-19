package collectionbasics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
	
	
	
	public static void main(String[] args) {
		
		
		HashSet<String> hs = new HashSet<String>();
		
//		To add the elements we can use add method
		
		
		hs.add("Daniel");
			
		hs.add("Eder");
		
		hs.add("Diana");
		
		hs.add("Ron");
		
		hs.add("Doug");
		
		hs.add("Cesar");
		
		hs.add("Ron");
		
		hs.add("Eder");
		
		System.out.println(hs);
		
		
LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
//		To add the elements we can use add method
		
		
		lhs.add("Daniel");
			
		lhs.add("Eder");
		
		lhs.add("Diana");
		
		lhs.add("Ron");
		
		lhs.add("Doug");
		
		lhs.add("Cesar");
		
		lhs.add("Ron");
		
		lhs.add("Eder");
		
		System.out.println(lhs);
		
		TreeSet<String> ts = new TreeSet<String>();
		
//		To add the elements we can use add method
			
		ts.add("Daniel");
			
		ts.add("Eder");
		
		ts.add("Diana");
		
		ts.add("Ron");
		
		ts.add("Doug");
		
		ts.add("Cesar");
		
		ts.add("Ron");
		
		ts.add("Eder");
		
		System.out.println(ts);
		
		
		
		
		
	}
	
	

}
