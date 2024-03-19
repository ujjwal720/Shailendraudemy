package shailendrajava;

public class movehashinfront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String l = "Ujjwal##sh#vayava";

		String resultant = "";

		for (int i = 0; i <= l.length() - 1; i++) {

			if (l.charAt(i) == '#' && !Character.isLetter(l.charAt(i))) {

				resultant = '#' + resultant;
			}

			else {

			
					
					resultant=resultant+l.charAt(i);

				

			}

		}
		
		System.out.println(resultant);

	}

}
