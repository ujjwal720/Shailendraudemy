package shailendrajava;

public class de {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * how many times 3 occurs in the given range
		 */

		int r1 = 1;
		int r2 = 15;
		int res = 3;
		int count = 0;
		String bn = Integer.toString(res);
		for (int i = r1; i <= r2; i++) {

			String bnx = Integer.toString(i);

			if (bnx.contains("3")) {

				count++;
			}

		}
		
		System.out.println(count);

	}

}
