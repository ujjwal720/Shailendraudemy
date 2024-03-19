package shailendrajava;

public class pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 6;

		/*
		 * pattern programs for the following
		 * 
		 * 
		 */

		for (int i = 1; i <= rows; i++) {

			int number = rows - 1;
			int z = number;
			int result = 0;
			for (int j = 1; j <= i; j++) {

				if (j == 1) {

					System.out.print(i);

				}

				else {

					if (j == 2) {
						int y = i;
						number = number + y;
						System.out.print(number);
						y--;
						result = number;

					}

					if (j > 2) {

						z--;
						result = result + z;
						System.out.print(result);

					}

				}
			}

			System.out.println();

		}

	}

}
