package shailendrajava;

public class printwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * print twice
		 */

		String s = "Hello";

		char[] r = s.toCharArray();

		String res = "";

		for (int i = 0; i <= r.length - 1; i++) {

			for (int j = 1; j <= 2; j++) {

				res = res + r[i];

			}

		}
		
		System.out.println(res);

	}

}
