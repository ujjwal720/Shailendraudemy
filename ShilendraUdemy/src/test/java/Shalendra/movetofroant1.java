package Shalendra;

import java.util.ArrayList;
import java.util.List;

public class movetofroant1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Ujjwal#Sh#Se#";
		char[] p = s.toCharArray();
		int count = 0;
		List<Character> l = new ArrayList<Character>();
		String resultant = "";

		for (int i = 0; i <= p.length - 1; i++) {

			if (p[i] == '#') {

				l.add(count, '#');

				count++;

			}

			else {

				l.add(s.charAt(i));

			}

		}

		for (int i = 0; i <= l.size() - 1; i++) {

			resultant = resultant + l.get(i);

		}
		
		System.out.println(resultant);

	}

}
