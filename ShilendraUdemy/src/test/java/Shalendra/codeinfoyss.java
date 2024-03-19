package Shalendra;

public class codeinfoyss {

	public static void main(String[] args) {
		// TODO Auto-generated method

		String a = "Ujjwal";
		String b = "123";
		String resultant = "";
		int x = b.length();
		int n = x - 1;
		int sd = a.length();
		int sdm = sd - 1;

		for (int i = 0; i <= a.length() - 1; i++) {

			if (i < x) {

				resultant = resultant + a.charAt(sdm);
				resultant = resultant + b.charAt(n);
				n--;
				sdm--;

			}

			else {

				resultant = resultant + a.charAt(sdm);
				sdm--;

			}

		}

		System.out.println(resultant);

	}

}
