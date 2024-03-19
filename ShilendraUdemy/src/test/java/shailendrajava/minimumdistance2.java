package shailendrajava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class minimumdistance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * minimu distance between two words
		 */

		String[] first = { "geeks", "for", "geeks", "contribute", "practice" };
		String f_m = "geeks";
		String s_m = "practice";
		List<Integer> io = new ArrayList<Integer>();

		for (int i = 0; i <= first.length - 1; i++) {

			if (first[i].equals(f_m)) {

				for (int j = i; j <= first.length - 1; j++) {

					if (first[j].equals(s_m)) {

						int d = i - j;
						int z = Math.abs(d);
						io.add(z);

					}

				}

			}

		}

		Collections.sort(io);
		System.out.println("The minimum distance is " + " " + io.get(0));

	}

}
