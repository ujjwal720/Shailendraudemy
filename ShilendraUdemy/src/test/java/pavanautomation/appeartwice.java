package pavanautomation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class appeartwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = { "geeks", "geeks", "kam", "kam","m","m" };

		List<String> ui = new ArrayList<String>();
		int count = 0;
		for (int i = 0; i <= s.length - 1; i++) {

			ui.add(s[i]);

		}
		List<String> uim = new ArrayList<String>(ui);
		Set<String> y_u = new HashSet<String>(uim);

		for (String word : y_u) {
			
			count=0;

			for (int i = 0; i <= uim.size() - 1; i++) {

				if (word.equals(uim.get(i))) {

					count++;

				}

			}

			if (count == 2) {

				System.out.println(word);

			}

		}

	}

}
