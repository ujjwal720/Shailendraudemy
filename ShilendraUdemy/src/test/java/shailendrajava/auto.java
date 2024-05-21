package shailendrajava;

public class auto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * if arry is equal or not
		 */

		int[] a = { 1, 1, 2, 3 };
		int[] b = { 1, 1, 2, 3 };
		int count = 0;

		if (a.length == b.length) {

			for (int i = 0; i <= a.length - 1; i++) {

				if (a[i] == b[i]) {

					count++;

				}

			}

			if (count == a.length) {

				System.out.println("Array is equal");

			}

			else {
				
				System.out.println("Array is not equal");

			}

		}

		else {

			System.out.println("As the array is not equl we should not do this steps");

		}

	}

}
