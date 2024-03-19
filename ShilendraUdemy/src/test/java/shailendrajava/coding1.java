package shailendrajava;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class coding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 */

		String l = "aaabbca";

		String fin = "";

		int x = 0;

		char[] iop = l.toCharArray();

		List<Character> a = new ArrayList<Character>();
		List<String> finals = new ArrayList<String>();

		for (int i = 0; i <= l.length() - 1; i++) {

			a.add(l.charAt(i));
			finals.add("?");

		}

		int count = 0;

		System.out.println(a.size());

		Set<Character> mo = new LinkedHashSet<Character>(a);
		List<Character> c = new ArrayList<Character>(mo);

		for (int i = 0; i <= c.size() - 1; i++) {

			count = 0;

			for (int j = 0; j <= a.size() - 1; j++) {

				if (c.get(i) == a.get(j)) {

					count++;
					x = j;
				}

				else {

					if (count >= 1) {

						String resultants = c.get(i) + Integer.toString(count);

						finals.add(j - 1, resultants);

						count = 0;

					}

				}

			}

			if (count >= 1) {
				String resultants = c.get(i) + Integer.toString(count);
				finals.add(x - 1, resultants);
			}

		}

		// System.out.println(finals);

		for (int i = 0; i <= finals.size() - 1; i++) {

			if (finals.get(i) != "?") {

				fin = fin + finals.get(i);

			}

		}

		System.out.println(fin);

	}

}
