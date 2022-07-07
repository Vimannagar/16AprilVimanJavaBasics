package variables;

public class College {
	
	static String collegename = "coep";
	
	String studentname;
	
	int mathmarks;
	
	int phymarks;
	
	
	public static void main(String[] args) {
		
		College s1 = new College();
		
		s1.studentname = "Eder";
		s1.mathmarks = 80;
		s1.phymarks = 40;
		
		
		College s2 = new College();
		s2.studentname = "Daniel";
		s2.mathmarks = 50;
		s2.phymarks = 20;
		
		System.out.println(s2.mathmarks);
		
		System.out.println(s1.mathmarks);
		System.out.println(s2.phymarks);
		
		System.out.println(s1.phymarks);
		
		System.out.println(collegename);
		
		System.out.println(s2.studentname);
		
		
	}
	

}
