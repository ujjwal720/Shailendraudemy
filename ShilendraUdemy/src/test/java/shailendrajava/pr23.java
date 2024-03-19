package shailendrajava;

public class pr23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * remove the spaces
		 */

		String s = "Ujjwal                 Shrivastava";

		String resultant = "";

		char[] r = s.toCharArray();

		for (int i = 0; i <= r.length - 1; i++) {

			if (Character.isLetter(r[i])) {

				resultant = resultant + r[i];

			}

		}

		System.out.println(resultant);

	}

}
