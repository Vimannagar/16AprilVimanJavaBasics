package operator;

public class IncrementAndDecrement {
	
	public static void main(String[] args) {
		int x = 10;
		
		int y = ++x;
	
		System.out.println(x);//11
		
		System.out.println(y);//11
		
		int w = 10;
		int z = w++;
		
		System.out.println(w);//11
		
		System.out.println(z);//10
		
		int v = 10;
		
		int u = --v;
		
		System.out.println(v);//9
		
		System.out.println(u);//9
		
		int d = 10;
		
		int c = d--;
		
		System.out.println(d);//9
		
		System.out.println(c);//10
		
		
	
	}

}
