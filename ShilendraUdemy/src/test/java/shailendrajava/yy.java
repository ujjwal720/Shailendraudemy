package shailendrajava;

public class yy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = { "H", "T", "H" };

		/*
		 * LET DOING THE PROGRAM
		 */
      int count=0;
		for (int i = 0; i <= s.length - 1; i++) {

			if (s[i].equals("H")) {
				
				count=count+2;

			}

			else {
				
				count=count-1;

			}

		}
		
		System.out.println(count);

	}

}
