package shailendrajava;

public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I am an good boy,Take that lightly";
		String[] io = s.split(",");
		String resultant = "";
		for (int i = 0; i <= io.length - 1; i++) {

			String[] l = io[i].split(" ");
			for (int j = l.length - 1; j >= 0; j--) {

				resultant = resultant + l[j]+" ";

				if (j == 0 && i != io.length - 1) {

					resultant = resultant + ",";

				}

			}

		}
		
		System.out.println(resultant);

	}

}
