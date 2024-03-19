package shailendrajava;

import java.util.ArrayList;
import java.util.List;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 3;

		int prev = 0;

		int count = 0;

		for (int i = 1; i <= rows; i++) {

			prev = prev + i;

			count = prev;

			for (int j = 1; j <= rows; j++) {

				if (i >= j) {

					System.out.print(count);
					count--;

				}

				else {

					System.out.print(" ");
				}

			}

			System.out.println();

		}

	}

}
