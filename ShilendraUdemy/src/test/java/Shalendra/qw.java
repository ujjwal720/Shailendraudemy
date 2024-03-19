package Shalendra;

import java.util.ArrayList;
import java.util.List;

public class qw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ab@c!d";
		/*
		 * Output = “dc@b!a”
		 */

		String resultant = "";
		List<Character> io = new ArrayList<Character>();
		List<Character> iom = new ArrayList<Character>();

		for (int i = 0; i <= str.length() - 1; i++) {

			if (!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))) {

				io.add(str.charAt(i));

			}

			else {

				iom.add(str.charAt(i));

			}

		}

		int len = io.size() - 1;
		int count = iom.size()-1;

		for (int i = 0; i <= str.length() - 1; i++) {

			if (Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))) {

				resultant = resultant + iom.get(count);
				count--;

			}

			else {

				resultant = resultant + io.get(len);
				len--;

			}

		}

		System.out.println(resultant);

	}

}
