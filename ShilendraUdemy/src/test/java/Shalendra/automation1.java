package Shalendra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class automation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * minimum distance between the two
		 */

		String[] s = { "geeks", "for", "geeks", "contribute", "practice" };

		String sq = "geeks";
		String s2 = "practice";
		List<Integer> uio=new ArrayList<Integer>();
		

		for (int i = 0; i <= s.length - 1; i++) {

			if (s[i].equals(sq)) {

				for (int j = i; j <= s2.length() - 1; j++) {

					if (s[j].equals(s2)) {
						
						int x=i-j;
						int z=Math.abs(x);
						//System.out.println(z);
						uio.add(z);
						break;
						

					}

				}

			}

		}
		
		Collections.sort(uio);
        System.out.println("The minimum value for teh follwoing is this"+ " "+ uio.get(0));
	}

}
