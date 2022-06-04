package constructor;

public class College {

		
	static String collegename = "coep";
	
	String studentname;
	
	int mathmarks;
	
	int phymarks;
	
	public College(String sname, int mmarks, int phymarks)
	{
		studentname = sname;
		
		mathmarks= mmarks;
		
		this.phymarks= phymarks;
		
	}
	
	public static void main(String[] args) {
		
		College s1 = new College("Eder", 50, 60);
		
		College s2 = new College("Diana", 80, 20);
		
		System.out.println(s1.mathmarks);
		
		System.out.println(s2.studentname);
		
	
	
		
	}
}
