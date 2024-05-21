package shailendrajava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class angrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * isomorphic strings in the java
		 */

		String d = "foo";
		String b = "bar";
		List<String> m = new ArrayList<String>();
		m.add(d);
		m.add(b);
		List<Integer> result1 = new ArrayList<Integer>();
		List<Integer> result2 = new ArrayList<Integer>();
		int count1 = 0;

		for (int i = 0; i <= m.size() - 1; i++) {
			List<Character> im = new ArrayList<Character>();
			List<Integer> iu = new ArrayList<Integer>();

			List<Character> lists = new ArrayList<Character>();
			String a = m.get(i);
			for (int j = 0; j <= a.length() - 1; j++) {

				im.add(a.charAt(j));
				iu.add(1);

			}
			Set<Character> sets = new LinkedHashSet<Character>(im);
			List<Character> lis = new ArrayList<Character>(sets);

			for (int k = 0; k <= lis.size() - 1; k++) {

				char t = lis.get(i);

				int count = 0;

				for (int p = 0; p <= im.size() - 1; p++) {

					if (lis.get(k) == im.get(p)) {

						count++;
						iu.set(p, count);

					}

				}

			}
           
			if (i == 0) {

				result1 = new ArrayList<Integer>(iu);

			}

			else {

				result2 = new ArrayList<Integer>(iu);

			}

		}

		for (int g = 0; g <= result1.size() - 1; g++) {

			if (result1.get(g) == result2.get(g)) {

				count1++;

			}

		}

		if (count1 == result1.size() && result1.size()==result2.size()) {

			System.out.println("The following is an ismorphic strings");

		}

		else {
			System.out.println("The following is not an ismorphic strings");

		}

	}

}
