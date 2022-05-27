package operator;

public class ConditionalOperator {
	
	public static void main(String[] args) {
		
		int i =10;
		int j = 20;
		int m = 20;
		
		boolean k = i==j;
		
		boolean l = j==m;
		
		System.out.println(k);//false
		
		System.out.println(l);//true
		
		
//		syntax: 
//			if(booleancondition)
//			{
//				actions
//			}
//			else
//			{
//				actions
//			}
		
		if(j==m)
		{
			System.out.println("if is executing");
		}
		else
		{
			System.out.println("else is executing");
		}
	}
	
//	WAP to check a number is even or odd

}
