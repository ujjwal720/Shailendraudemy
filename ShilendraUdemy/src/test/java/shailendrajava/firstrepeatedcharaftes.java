package shailendrajava;

public class firstrepeatedcharaftes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String l = "abc";
		int count = 0;
		char uy = 'j';
		for (int i = 0; i <= l.length() - 1 - 1; i++) {

			if (l.charAt(i) == l.charAt(i + 1)) {

				count++;
				uy = l.charAt(i);
				break;

			}

		}

		if (count == 1) {

			System.out.println(uy);

		}

		if (count == 0) {

			System.out.println("No nned of repeated character as it do not have any");

		}

	}

}
