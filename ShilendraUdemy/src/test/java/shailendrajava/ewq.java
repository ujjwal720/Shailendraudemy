package shailendrajava;

public class ewq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * leter to next character
		 */

		String s = "abc";
		String resultant = "";

		for (int i = 0; i <= s.length() - 1; i++) {

			int cv = (char) s.charAt(i);
			int p = cv + 1;
			char t = (char) p;
			resultant = resultant + t;
		}
		
		System.out.println(resultant);

	}

}
