package shailendrajava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class qwe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "kapoorrr";

		String resultant = "";

		List<Character> i_o = new ArrayList<Character>();

		char[] ri = s.toCharArray();

		for (int i = 0; i <= ri.length - 1; i++) {

			i_o.add(ri[i]);

		}

		int max = 1;
		Set<Character> i_z = new LinkedHashSet<Character>(i_o);

		List<Character> i_om = new ArrayList<Character>(i_z);

		for (int j = 0; j <= i_om.size() - 1; j++) {

			int count = 0;

			for (int k = 0; k <= i_o.size() - 1; k++) {

				if (i_o.get(k) == i_om.get(j)) {

					count++;

				}

			}

			if (count==1) {

				resultant = resultant + i_om.get(j);
			}

			if (count >max) {

				max = count;

				for (int h = 1; h <= count; h++) {

					resultant = i_om.get(j) + resultant;

				}
			}

		}
		
		System.out.println(resultant);

	}

}
