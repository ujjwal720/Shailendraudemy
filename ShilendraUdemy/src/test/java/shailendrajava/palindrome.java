package shailendrajava;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "race car.";
		String[] j = s.split("");
		String resultant = "";
		for (int i = 0; i <= j.length - 1; i++) {

			if (Character.isLetter(s.charAt(i))) {
				
				resultant = resultant + j[i];

			}

			else {

				

			}

		}

		StringBuilder sb = new StringBuilder(resultant);

		String y = sb.reverse().toString();
		

		if (resultant.equals(y)) {

			System.out.println("palindrome");
		}

		else {
			
			System.out.println("no");

		}
	}

}
