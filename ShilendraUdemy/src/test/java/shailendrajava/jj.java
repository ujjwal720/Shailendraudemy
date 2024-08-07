package shailendrajava;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class jj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * programming union and intersection in an arry
		 */

		int[] io = { 1, 3, 4, 5, 7 };
		int[] po = { 2, 3, 5, 6 };
		List<Integer> pol = new ArrayList<Integer>();
		List<Integer> union=new ArrayList<Integer>();

		for (int i = 0; i <= io.length - 1; i++) {

			try {

				pol.add(io[i]);
				pol.add(po[i]);

			} catch (Exception e) {
				
				e.printStackTrace();

			}

		}
		
		Set<Integer> yt=new LinkedHashSet<Integer>(pol);
		List<Integer> polz = new ArrayList<Integer>(yt);
		
		/*
		 * union of two arrys
		 */
		
		
		

	}

}
