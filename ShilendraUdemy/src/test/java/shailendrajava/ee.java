package shailendrajava;

public class ee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vowels = 0;
		int constants = 0;

		String s = "Ujjwal123";

		char[] iu = s.toCharArray();

		for (int i = 0; i <= iu.length - 1; i++) {

			if (iu[i] == 'a' || iu[i] == 'e' || iu[i] == 'i' || iu[i] == 'o' || iu[i] == 'u') {

				vowels++;
			}

			else {

				int x = (char) iu[i];

				if (x >= 65) {
					
					constants++;

				}

			}

		}
		
		
		System.out.println(vowels);
		System.out.println(constants);
		

	}

}
