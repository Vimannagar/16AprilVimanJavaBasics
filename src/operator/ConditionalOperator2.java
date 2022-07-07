package operator;

public class ConditionalOperator2 {

	public static void main(String[] args) {

		// '>' greater than operator

		int i = 500;

		int j = 60;

		boolean isgreater = i > j;
		System.out.println(isgreater);

		// '<' less than operator

		boolean k = i < j;

		System.out.println(k);// false

		// '>=' greater than or equal to operator

		int l = 80;

		int m = 60;

		boolean n = m >= l;
		
		boolean h = l>= m;
		
		System.out.println("H value is :"+h);//true

		System.out.println(n);// true

		// '<=' less than or equal to operator

		boolean o = l <= m;

		System.out.println(o);// true

		if (o) {
			System.out.println("if is running");
		} else {
			System.out.println("else is running");
		}

		// '!=' Not equal to operator

		int z = 40;

		int x = 50;

		boolean y = x != z;

		boolean d = l != m;
		
		System.out.println(d);//false

		System.out.println(y);// true

	}

}
