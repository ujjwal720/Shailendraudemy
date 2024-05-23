package shailendrajava;

public class reversewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "i.like.this.program.very.much";
		String[] io = S.split("\\.");
		String resultant = "";
		int count = 0;
		for (int i = io.length - 1; i >= 0; i--) {

			if (i != 0) {

				resultant = resultant + io[i] + ".";

			}

			else {
				
				resultant = resultant + io[i];

			}

		}

		System.out.println(resultant);

	}

}
