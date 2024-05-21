package shailendrajava;

import java.util.ArrayList;
import java.util.List;

public class t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * length of the last word
		 */

		String a = "Hello        World           ";

		String[] pol = a.split(" ");

		List<String> iu = new ArrayList<String>();

		for (int i = 0; i <= pol.length - 1; i++) {

			if (!pol[i].equals("")) {

				iu.add(pol[i]);

			}

		}
		
		System.out.println("Th elength of the last word is"+iu.get(iu.size()-1).length());

	}

}
