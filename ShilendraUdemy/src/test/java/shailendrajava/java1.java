package shailendrajava;

public class java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Ujjwal Shrivastava";
		String[] io = s.split(" ");
		String resultant = "";
		for (int i = 0; i <= io.length - 1; i++) {

			String results = io[i];
			if (i < io.length - 1) {

				resultant = resultant + io[i].charAt(0) + " ";
			}

			else {

				resultant = resultant + io[i].charAt(0);

			}

		}

		System.out.println(resultant);

	}

}
