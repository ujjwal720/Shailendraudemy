package shailendrajava;

public class nuoftime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "samay raina";
		/*
		 * convert first letter to upper case in the base of .
		 */

		String[] words = s.split(" ");
		String results = "";

		for (int i = 0; i <= words.length - 1; i++) {

			String t = words[i];

			for (int j = 0; j <= t.length() - 1; j++) {

				if (j == 0) {

					results = results + Character.toUpperCase(t.charAt(0));

				}

				else {

					results = results + Character.toUpperCase(t.charAt(j));

				}

			}

			results = results + '.';

		}
		
		System.out.println(results);

	}

}
