package shailendrajava;

import java.util.HashMap;
import java.util.Map;

public class ii66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * automation testing interveiw questions end to end
		 * 
		 */

		int[] a = { 1, 2, 2, 3, 1, 2, 3, 4 };

		Map<Integer, Integer> lo = new HashMap<Integer, Integer>();

		for (int i = 0; i <= a.length - 1; i++) {

			if (lo.containsKey(a[i])) {

				lo.put(a[i], lo.get(a[i]) + 1);
			}

			else {
				
				lo.put(a[i], 1);

			}

		}
		
	         System.out.println(lo);

	}

}
