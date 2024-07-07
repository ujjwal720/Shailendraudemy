package shailendrajava;

import java.util.ArrayList;
import java.util.List;

public class reversevowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "practice";
		List<Character> im = new ArrayList<Character>();
		String results = "";
		int count = 0;
		int xm = 0;

		for (int i = s.length() - 1; i >= 0; i--) {

			

			if (s.charAt(xm) == 'a' || s.charAt(xm) == 'e' || s.charAt(xm) == 'i' || s.charAt(xm) == 'o'
					|| s.charAt(xm) == 'u') {

				results = results + s.charAt(i);
				count++;

			}

			else {

				results = results + s.charAt(count);
				count++;
			}
			
			xm++;

		}

		// int count=results.length()-1;

		/*
		 * 
		 * for (int i = 0; i <= s.length() - 1; i++) {
		 * 
		 * if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||
		 * s.charAt(i) == 'o' || s.charAt(i) == 'u') {
		 * 
		 * 
		 * lm=lm+results.charAt(count); count--;
		 * 
		 * 
		 * 
		 * }
		 * 
		 * else {
		 * 
		 * lm=lm+s.charAt(i); }
		 * 
		 * }
		 * 
		 * 
		 * System.out.println(lm);
		 * 
		 */
		System.out.println(results);

	}

}
