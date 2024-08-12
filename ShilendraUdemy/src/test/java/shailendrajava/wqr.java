package shailendrajava;

public class wqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * aaabbbcccaa; a3b3c3aa2 this is how the output is done
		 */

		String s = "aaabbaa";
		String result = "";
		int count = 1;
		for (int i = 0; i <= s.length() - 1 - 1; i++) {

			if (s.charAt(i) == s.charAt(i + 1)) {

				count++;
				
				if (i == s.length() - 2) {
					result = result + s.charAt(i) + count;
					count=1;
					
				}

			}
			
			else {
				
				result = result + s.charAt(i) + count;
				count=1;
			}

		}
		
		System.out.println(result);

	}
}