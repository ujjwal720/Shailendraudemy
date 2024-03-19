package shailendrajava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class li {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> a = new ArrayList<Integer>();

		int[] c = { 1, 2, 56, 13, 12 };
		int[] d = { 12, 56, 12, 16, 89, 27 };

		int actual = c.length > d.length ? c.length : d.length;

		for (int i = 0; i <= d.length - 1; i++) {

			try {

				a.add(c[i]);
			}
			
			catch(Exception e) {
				
			}
			
			try {
				a.add(d[i]);

			}

			catch (Exception e) {

			}

		}
		
		System.out.println(a);

	}
}