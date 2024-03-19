package pavanautomation;

import java.util.ArrayList;
import java.util.List;

public class re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * by this we can covert it to hex by suing the code in java
		 */

		int number = 5386;
		List<Integer> ui = new ArrayList<Integer>();

		while (number != 0) {

			int p = number / 16;
			int x = number % 16;
			ui.add(x);
			number = p;

		}
		System.out.println(ui);

	}

}
