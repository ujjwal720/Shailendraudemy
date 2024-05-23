package shailendrajava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class commonelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3,6,6,6,6,6 ,4};
		int[] b = { 1, 2, 7 ,6,5};
		List<Integer> io = new ArrayList<Integer>();
		List<Integer> duplicates = new ArrayList<Integer>();

		for (int i = 0; i <= a.length - 1; i++) {

			io.add(a[i]);

		}

		Set<Integer> im = new HashSet<Integer>(io);
		List<Integer> y = new ArrayList<Integer>(im);

		for (int i = 0; i <= y.size() - 1; i++) {
			int num = y.get(i);
			int count = 0;
			for (int j = 0; j <= b.length - 1; j++) {

				if (num == b[j]) {

					count++;
				}

			}

			if (count > 0) {
				
				duplicates.add(num);

			}

		}
		
		System.out.println(duplicates.size());

	}

}
