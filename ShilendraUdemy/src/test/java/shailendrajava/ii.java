package shailendrajava;

public class ii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Swiggy1234omato9876";
		StringBuilder iu = new StringBuilder();
		String results = "";
		String num = "";

		for (int i = 0; i <= s.length() - 1; i++) {

			if (Character.isDigit(s.charAt(i))) {

				num = num + s.charAt(i);

				if (i == s.length() - 1) {

					iu = new StringBuilder(num);
					iu = iu.reverse();
					results = results + iu.toString();
					num = "";

				}

			} else {

				
				iu = new StringBuilder(num);
				iu = iu.reverse();
				results = results + iu.toString();
				results = results + s.charAt(i);
				num = "";

			}

		}

		String t = results.trim();
		System.out.println(t);

	}

}
