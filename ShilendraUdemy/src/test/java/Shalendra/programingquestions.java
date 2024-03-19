package Shalendra;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class programingquestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String as unique character or not
		 */

		String s = "Ujjwal".toLowerCase();
		List<Character> io = new ArrayList<Character>();
		for (int i = 0; i <= s.length() - 1; i++) {

			io.add(s.charAt(i));

		}

		Set<Character> iom = new HashSet<Character>(io);

		if (iom.size() - 1 == io.size() - 1) {

			System.out.println("The character are unique");

		}

		else {
			
			System.out.println("The character is not unique");

		}

	}

}
