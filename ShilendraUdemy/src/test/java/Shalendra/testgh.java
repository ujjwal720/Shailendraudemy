package Shalendra;

public class testgh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "selctssss a very country";
		String[] b = s.split(" ");
		int max = b[0].length();
		String resultant = b[0];

		for (int i = 1; i <= b.length-1; i++) {

			if (max < b[i].length()) {

				resultant = b[i];
				max = b[i].length();

			}

		}
		
		System.out.println(resultant);

	}

}
