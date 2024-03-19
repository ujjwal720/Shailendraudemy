package Shalendra;

public class secondque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * removesaces
		 */

		String s = "g           e                   kkk       s";
		char[] k = s.toCharArray();
		String resultant = "";
		for (int i = 0; i <= k.length - 1; i++) {

			if (!Character.isSpace(k[i])) {

				resultant = resultant + k[i];

			}

		}
		
		System.out.println(resultant);

	}

}
