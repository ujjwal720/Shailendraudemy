package shailendrajava;

public class fgd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * automation testing practice
		 */

		String s = "Welcome        to          java woorld";

		char[] op = s.toCharArray();

		String results = "";

		for (int i = 0; i <= op.length - 1; i++) {

			if (Character.isSpace(op[i])) {

			}

			else {

				results = results + op[i];

			}

		}
		
		System.out.println(results);

	}

}
