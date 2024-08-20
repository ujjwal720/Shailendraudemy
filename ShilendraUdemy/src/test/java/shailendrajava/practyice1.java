package shailendrajava;

public class practyice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * print duplicate character only more than one
		 * 
		 */

		String s = "Gogglee";
				

		String j = s.toLowerCase();

		String resu = "";

		

		char gh = ' ';

		for (int i = 0; i < j.length() - 1; i++) {
			int count = 1;

			gh = j.charAt(i);

			if (gh != '?') {

				for (int k = i + 1; k <= j.length() - 1; k++) {

					if (gh == j.charAt(k)) {

						count++;

						j = j.replace(j.charAt(k), '?');
						break;

					}
				}

				if (count > 1) {

					resu = resu + gh;

				}

			}

		}
		System.out.println("The duplicate aree"+" "+resu);

	}

}
