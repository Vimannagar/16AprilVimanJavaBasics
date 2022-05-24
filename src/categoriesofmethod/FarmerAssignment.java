package categoriesofmethod;

public class FarmerAssignment {
	
	public static int areaCalculator(int length, int breadth)
	{
		int area = length * breadth;
		
		System.out.println("Area is :"+area);
		
		return area;
		
	}
	
	public static void main(String[] args) {
	int area1 = areaCalculator(10, 15);
	
	int area2	= areaCalculator(5, 20);
	
	int area3	= areaCalculator(20, 20);
	
	int totalarea = area1 +area2+area3;
	
	System.out.println("Total area is :"+totalarea+" sqm" );
	
	
	}
	

}
