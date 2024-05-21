package shailendrajava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class elementsofarrayequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Automation testing
		 * 
		 */

		int[] x = { 1, 3, 3, 1, 1, 1, 2, 0, 1 };
		List<Integer> u = new ArrayList<Integer>();

		for (int i = 0; i <= x.length - 1; i++) {

			u.add(x[i]);

		}

		Set<Integer> io = new HashSet<Integer>(u);
		List<Integer> iom = new ArrayList<Integer>(io);
	

		for (int i = 0; i <= iom.size() - 1; i++) {

			int count = 0;

			for (int j = 0; j <= u.size() - 1; j++) {

				if (iom.get(i) == u.get(j)) {

					count++;

				}

			}
			
			
			System.out.println("The following integer"+" "+iom.get(i)+" " + "and the frequency for the following is"+" "+count);
			

		}

	}

}
