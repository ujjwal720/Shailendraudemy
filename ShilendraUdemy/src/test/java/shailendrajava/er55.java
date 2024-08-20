package shailendrajava;

import java.util.ArrayList;
import java.util.List;

public class er55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * automation testing
		 * 
		 * 
		 * for each is given below for the following
		 */

		/*
		 * 
		 * int[] uy = { 1, 2, 3, 7, 1, 2 };
		 * 
		 * for(int y:uy) {
		 * 
		 * 
		 * System.out.println(y); }
		 * 
		 * 
		 */

		/*
		 * aabcccccaaa" would become "a2b1c5a3".
		 * reverse in string
		 */

		String s = "a2b1c5a3";
		List<Integer> iu = new ArrayList<Integer>();
		List<Character> xc = new ArrayList<Character>();
		String res = "";

		for (int i = 0; i <= s.length() - 1; i++) {

			if (Character.isDigit(s.charAt(i))) {

				int dig = Integer.parseInt(Character.toString(s.charAt(i)));

				iu.add(dig);

			}

			else {

				xc.add(s.charAt(i));

			}

		}

		for (int i = 0; i <= iu.size() - 1; i++) {

			char re = xc.get(i);

			for (int j = 0; j <= iu.get(i) - 1; j++) {

				res = res + re;

			}

		}
		
		System.out.println(res);

	}

}
