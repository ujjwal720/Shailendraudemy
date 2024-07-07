package shailendrajava;

public class commonprefix12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * second larget method in this
		 */

		int n = 1;
		int we = 0;
		int largest = 2;
		int dig=2;

		int[] a = { 1, 2, 3, 4, 5, 6 };

		while (n <=largest) {

			int max = a[0];

			for (int i = 0; i < a.length; i++) {

				if (a[i] > max) {

					max = a[i];
					we = i;

				}

			}
            dig=a[we];
			a[we] = -1;
			n++;

		}
		
		System.out.println(dig);

	}

}
