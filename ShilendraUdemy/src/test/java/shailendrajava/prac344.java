package shailendrajava;

public class prac344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 7;
		int unit = 2;
		int[] x = { 2, 8, 3, 5, 7, 4, 1, 2 };

		int totalfood = unit * r;
		int count = 0;
		int sum = 0;

		for (int i = 0; i <= x.length - 1; i++) {

			sum = sum + x[i];

			count++;

			if (sum >= totalfood) {

				break;
			}

		}

		System.out.println("The count for the following will be as follows" + " " + count + " ");
	}

}
