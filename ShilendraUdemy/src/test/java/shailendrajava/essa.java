package shailendrajava;

import java.util.ArrayList;
import java.util.List;

public class essa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * intersection of two elements
		 */

		int[] a = {89, 24, 75, 11, 23,89,89,89};
		int[] b = {89, 2, 4,89};
		int[] z;
		int[] f;
		int count = 0;
		List<Integer> iu = new ArrayList<Integer>();
		if (a.length > b.length) {

			z = new int[a.length];
			z = a;
			f = b;
			for (int i = 0; i <= a.length - 1; i++) {

				iu.add(a[i]);

			}

			for (int i = 0; i <= b.length - 1; i++) {

				if (iu.contains(b[i])) {

					count++;

				}

			}
			
			System.out.println(count);

		}

		else {
			
			z = new int[b.length];
			z = b;
			f = a;
			for (int i = 0; i <= b.length - 1; i++) {

				iu.add(b[i]);

			}

			for (int i = 0; i <= a.length - 1; i++) {

				if (iu.contains(a[i])) {

					count++;

				}

			}
			
			System.out.println(count);
			
			

		}

	}

}
