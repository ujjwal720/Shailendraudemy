package Shalendra;

public class bysuingforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Moon is an beautiful planet";
		char[] io = s.toCharArray();
		String resultant = "";
		for (int i = 0; i <= io.length - 1; i++) {

			if (io[i] == ' ') {

				resultant = resultant + '-';

			}

			else {

				resultant = resultant + io[i];

			}

		}
		
		System.out.println(resultant);

	}

}
