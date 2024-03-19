package shailendrajava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class pccursnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Ujjwal";
		List<Character> k = new ArrayList<Character>();
		for (int i = 0; i <= s.length() - 1; i++) {

			k.add(s.charAt(i));

		}

		Set<Character> iu = new LinkedHashSet<Character>(k);
		List<Character> iul = new ArrayList<Character>(iu);

		for (int i = 0; i <= iul.size() - 1; i++) {

			int count = 0;

			char tm = iul.get(i);

			for (int j = 0; j <= s.length() - 1; j++) {

				if (tm == k.get(j)) {
					
					count++;

				}

			}
			
			System.out.println("The character which are" + " "+ tm +"="+ count);

		}

	}

}
