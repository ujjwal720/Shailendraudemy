package shailendrajava;

import java.util.ArrayList;
import java.util.List;

public class rew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = { "abc","bcd","aaaa","cbc" };
		char d = 'a';
		String y = Character.toString(d);
		CharSequence target = y;
		List<Integer> o=new ArrayList<Integer>();

		for (int i = 0; i <= s.length - 1; i++) {

			String le = s[i];

			if (le.contains(target)) {
				
				o.add(i);
			}

		}

	}

}
