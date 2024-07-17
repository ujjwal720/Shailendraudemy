package shailendrajava;

import java.util.ArrayList;
import java.util.List;

public class wqee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a = { "home", "milk", "Mercury", "fish" };
		List<String> io = new ArrayList<String>();
		String target = "me";

		for (int i = 0; i <= a.length - 1; i++) {

			String res = a[i].toLowerCase();

			boolean x = res.contains(target);

			if (x == true) {

				io.add(res);
			}

		}

		if (io.isEmpty()) {
			io.add("Empty");
		}
		
		System.out.println(io);
		String[] p=io.toArray(new String[0]);
		System.out.println(p.length);

	}

}
