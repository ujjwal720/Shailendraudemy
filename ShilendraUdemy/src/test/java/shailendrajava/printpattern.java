package shailendrajava;

public class printpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * print the following pattern form the gfg
		 */

		int rows = 3;
		int count = rows * rows;
		int div = rows;

		for (int i = rows; i >= 1; i--) {

			int x = count;
			int dl = rows;
			for (int j = 1; j <= x; j++) {

				System.out.print(dl);

				if (j % div == 0) {

					dl--;

				}

			}
			System.out.println();
			div--;
			count = count - rows;

		}

	}

}
