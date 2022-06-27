package arraysdiscussion;

public class AlternateWayCreateArray {
	
	public static void main(String[] args) {
		
		String [] s = {"Patna", "Kanpur", "Lucknow", "Varanasi"};
		
		
		int size = s.length;
		
		System.out.println(size);
		
		
		for(String ss :s)
		{
			if(!(ss.equalsIgnoreCase("Patna")))
			{
				System.out.println(ss);
			}
		}
		
		
	}

}
