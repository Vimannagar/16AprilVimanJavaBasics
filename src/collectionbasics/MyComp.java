package collectionbasics;

import java.util.Comparator;

public class MyComp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o1.compareTo(o2);
	}

}
