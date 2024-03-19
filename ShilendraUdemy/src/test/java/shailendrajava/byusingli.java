package shailendrajava;

import java.util.ArrayList;
import java.util.List;

public class byusingli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4

		int rows = 3;
		int count = 0;

		for (int i = 1; i <= rows; i++) {

			List<Integer> iu = new ArrayList<Integer>();

			for (int j = 1; j <= i; j++) {

				if (i >= j) {

					count++;

					iu.add(j);

				}

			}

		}

	}

}
