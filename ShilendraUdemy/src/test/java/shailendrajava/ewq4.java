package shailendrajava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ewq4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * alternate ostive an dnegative
		 */

		int[] xc = { -1, 3, -2, -4, 7, -5 };
		List<Integer> op = new ArrayList<Integer>();
		List<Integer> pol = new ArrayList<Integer>();
		List<Integer> res = new ArrayList<Integer>();

		for (int i = 0; i <= xc.length - 1; i++) {

			if (xc[i] > 0) {

				op.add(xc[i]);

			}

			else {

				pol.add(xc[i]);
			}

		}

		/*
		 * 
		 * int r = Math.max(op.size(), pol.size());
		 * 
		 * int x = Math.min(op.size(), pol.size());
		 * 
		 * for (int i = 0; i <= r - 1; i++) {
		 * 
		 * try {
		 * 
		 * res.add(op.get(i));
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * catch (Exception e) { // TODO: handle exception }
		 * 
		 * 
		 * try {
		 * 
		 * res.add(pol.get(i)); }
		 * 
		 * catch(Exception e) {
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * }
		 * 
		 * System.out.println(res);
		 * 
		 */

		int r = Math.max(op.size(), pol.size());

		int x = Math.min(op.size(), pol.size());

		for (int i = 0; i <= r - 1; i++) {

			if (i < op.size()) {
				
				res.add(op.get(i));

			}
			
			if(i<pol.size()) {
				
				res.add(pol.get(i));
			}
			
			

		}
		
		System.out.println(res);

	}
}
