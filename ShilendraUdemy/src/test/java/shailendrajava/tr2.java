package shailendrajava;

public class tr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * nearest muktiple of 10
		 */
		String N = "15";
		int x = Integer.parseInt(N);
		int n = x + 10;
		int r = x - 10;
		int value1 = 0;
		int value2 = 0;
		if (x % 10 != 0) {
			for (int i = x; i <= n; i++) {

				if (i % 10 == 0) {

					value1 = i;
					break;

				}

			}

			for (int i = x; i >= value2; i--) {

				if (i % 10 == 0) {

					value2 = i;
					break;

				}

			}

			int z = Math.abs(x - value1);

			int z1 = Math.abs(x - value2);

			if (z == z1) {

				System.out.println(Integer.toString(value2));
			}

			else if (z > z1) {

				System.out.println(value2);
			}

			else if (z < z1) {

				System.out.println(value1);
			}

		}

		else {

			System.out.println(x);

		}

	}

}
