package shailendrajava;

import java.util.ArrayList;
import java.util.List;

public class duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * which are duplicates we need the name of the following
		 */

		String[] fruits = {"apple", "banana", "orange", "apple", "grape", "banana", "banana"};
		List<String> duplicate = new ArrayList<String>();
		for (int i = 0; i <= fruits.length - 1; i++) {
			
		if(!fruits[i].equals("?")) {

			int count = 0;

			String results = fruits[i];

			for (int j = 0; j <= fruits.length - 1; j++) {

				if (results.equals(fruits[j])) {

					count++;
					fruits[j]="?";

				}

			}

			if (count > 1) {
				
				duplicate.add(results);

			}
			
			
		}

		}
		
		System.out.println(duplicate);

	}

}
