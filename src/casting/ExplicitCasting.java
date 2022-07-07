package casting;

public class ExplicitCasting {

	public static void main(String[] args) {
		int i = 100;

		byte b = (byte) i;

		System.out.println(b);

		char c = 'A';

		long f = (long) c;// implicit casting

		System.out.println(f);

	}

}
