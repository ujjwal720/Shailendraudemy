package shailendrajava;

public class absoluediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * find tranistion point
		 */

		int[] a = { 0, 0, 0, 0, 1 };

		int f_p = a[0];

		int x = 0;

		for (int i = 0; i <= a.length - 1; i++) {

			if (f_p != a[i]) {
				
				x=i;
				break;

			}

		}
		
		System.out.println("The equlibirium point for the following is"+" "+x);
		

	}

}
