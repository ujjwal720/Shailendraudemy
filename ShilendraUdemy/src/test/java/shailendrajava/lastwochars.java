package shailendrajava;

public class lastwochars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String N = "4302";
		if (N.length() > 3) {
			String L = N.substring(0, N.length() - 2);
			char iu = N.charAt(N.length() - 1);
			char iz = N.charAt(N.length() - 2);
			String gh = Character.toString(iz) + Character.toString(iu);
			int x = Integer.parseInt(gh);
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

					System.out.println(L + Integer.toString(value2));
				}

				else if (z > z1) {

					System.out.println(L + value2);
				}

				else if (z < z1) {

					System.out.println(L + value1);
				}

			}

			else {

				System.out.println(N);

			}

		} else {
			
			
			

		}

	}

}
