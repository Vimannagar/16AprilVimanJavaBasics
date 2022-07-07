package stringclass;

public class RemoveSpaceFromString {

	public static void main(String[] args) {

		String s = "I live     in Pune";

		String s1 = s.replace(" ", "");

		System.out.println(s1);// IliveinPune

	}

}
