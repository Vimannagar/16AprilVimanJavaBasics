package collectionbasics;

import java.util.ArrayList;

public class ListInterfaceClass {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>();
		
//		To add the elements we can use add method
		
		
		al.add("Daniel");
			
		al.add("Eder");
		
		al.add("Diana");
		
		al.add("Ron");
		
		al.add("Doug");
		
		al.add("Cesar");
		
		System.out.println(al);//[Daniel, Eder, Diana, Ron, Doug, Cesar]

		//		To remove the element from arraylist	
		al.remove("Eder");
		

		System.out.println(al);//[Daniel, Diana, Ron, Doug, Cesar]

		//		To update  the element from arraylist		
		al.set(0, "Jose");
		
		System.out.println(al);//[Jose, Diana, Ron, Doug, Cesar]
		
//		To get a value at a specific index	
		String value = al.get(2);
		
		System.out.println(value);//Ron
		
//	To get the index position of a value	
		int indexofcesar = al.indexOf("Cesar");
		
		System.out.println(indexofcesar);//4
		
		
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		
		al2.add("Lauro");
		
		al2.add("Cynthia");
		
		al2.add("Edward");
		
		al2.add("Roger");
//	To add the content of one Collection(ArrayList) to another collection(ArrayList)	
	
		al2.addAll(al);
		System.out.println(al2);
//	To check the element is present in the collection	
		
		boolean ispresent = al2.contains("Lauro");
		
		System.out.println("Lauro is returning :"+ispresent);

		// To check whether the elements of one collection is available into another or not		
		boolean allpresent = al2.containsAll(al);
		
		System.out.println(allpresent);
		
	}

}
