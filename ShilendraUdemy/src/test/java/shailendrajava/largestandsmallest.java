package shailendrajava;

public class largestandsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * max and min number for revese this rerverse
		 */

		int[] a = { 1, 2, 1, 6, 8, 10, 9 };
		int max = a[0];

		for (int i = 1; i <= a.length - 1; i++) {

			if (max < a[i]) {

				max = a[i];

			}

		}

		System.out.println(max);

	}

}
