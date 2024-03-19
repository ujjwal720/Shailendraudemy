package shailendrajava;

public class programreversebyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "India is my country";
		String[] io = s.split(" ");
		for (int i = 0; i <= io.length - 1; i++) {

			String result = io[i];
			StringBuilder ty = new StringBuilder(result);
			String uyt = ty.reverse().toString();
			if (i != io.length - 1) {
				System.out.print(uyt + " ");
			} else {

				System.out.print(uyt);

			}

		}

	}

}
