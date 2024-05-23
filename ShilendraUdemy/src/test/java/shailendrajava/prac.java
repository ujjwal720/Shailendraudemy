package shailendrajava;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aAbBcC";
		int count = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			try {
				String actual = Character.toString(s.charAt(i));
				String nonactual = Character.toString(s.charAt(i + 1));

				if (actual.equalsIgnoreCase(nonactual)) {

				}

				else {
					count++;
				}

			}

			catch (Exception e) {

			}

		}
		
		System.out.println(count);

	}

}
