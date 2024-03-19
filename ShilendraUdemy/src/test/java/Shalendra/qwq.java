package Shalendra;

public class qwq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "this is an great match of india";
		String[] k = s.split(" ");
		String resultant = "";
		String resultant1 = "";
		/*
		 * first character as captal
		 */

		for (int i = 0; i <= k.length - 1; i++) {

			String l = k[i];

			for (int j = 0; j <= l.length() - 1; j++) {

				if (j == 0) {

					resultant = resultant + Character.toUpperCase(l.charAt(0));

				}

				else {

					resultant = resultant + l.charAt(j);

				}

			}

			if (i < k.length - 1 ) {

				resultant1 = resultant1 + resultant+" ";

			} else {
				
				resultant1=resultant1+resultant;

			}
			
			resultant="";

		}
		
		System.out.println(resultant1);

	}

}
