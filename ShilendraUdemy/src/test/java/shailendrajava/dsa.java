package shailendrajava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110 };
		int loops = 0;
		int[] b = new int[a.length];
		if (a.length % 2 == 0) {

			loops = a.length / 2;
		}

		else {

			loops = a.length / 2 + 1;
		}
		List<Integer> b = new ArrayList<Integer>();

		for (int i = 0; i <= a.length - 1; i++) {

			b.add(a[i]);

		}

		Collections.sort(b);
		int count = b.size() - 1;
		int count1 = 0;
		List<Integer> sortx = new ArrayList<Integer>();

		for (int i = 0; i <= loops - 1; i++)

		{
			try {

				if (sortx.size() != b.size()) {

					sortx.add(b.get(count));
				}

				if (sortx.size() != b.size()) {

					sortx.add(b.get(count1));
				}

			}

			catch (Exception e) {

			}

			count--;
			count1++;

		}

		for (int i = 0; i <= sortx.size() - 1; i++) {
			
			

		}

	}

}
