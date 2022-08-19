package collectionbasics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MethodsOfHashMap {
	
	public static void main(String[] args) {
		
		
HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Delhi");
		hm.put(201, "Mumbai");
		hm.put(740, "Delhi");
		hm.put(800, "Pune");
		hm.put(820, "Baramati");
		hm.put(900, "Aurangabad");
		hm.put(600, "Delhi");
		
		
		System.out.println(hm);
		
//		To get the keys of hashmap:
		
		Set<Integer> keys = hm.keySet();
		
		System.out.println(keys);
		
//		To get the values:
		
		Collection<String> value = hm.values();
		
		System.out.println(value);
//	To check the key is present or not	
boolean iskeypresent = hm.containsKey(800);

System.out.println(iskeypresent);//true

//To check the value is present or not
		boolean isvaluepresent = hm.containsValue("Kolkata");
		
		System.out.println(isvaluepresent);//false
		
		
//		To get the value with respect to the key:
		
		String valuess = hm.get(820);
		
		System.out.println(valuess);
		
		
		Set<Entry<Integer, String>> keyvalue = hm.entrySet();
		
		for(Entry<Integer, String> kv :keyvalue)
		{
			if((kv.getKey()>200))
					{
			System.out.println(kv.getKey()+" "+kv.getValue());
					}
		}
		
		
//		WAP to count the characters occurs inside a String - "communittee"
		
	}

}
