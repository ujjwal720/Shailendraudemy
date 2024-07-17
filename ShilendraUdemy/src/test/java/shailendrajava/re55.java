package shailendrajava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class re55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] io = { "flower", "flat", "flp", "fle" };
		int count = 0;
		String results = "";

		List<Integer> iom = new ArrayList<Integer>();

		for (int i = 0; i <= io.length - 1; i++) {

			iom.add(io[i].length());

		}

		Collections.sort(iom);

		int temp = iom.get(0);

		for (int i = 0; i <= temp - 1; i++) {

			String yz = io[1];
			char t = yz.charAt(i);

			for (int j = 0; j <= io.length - 1; j++) {

				String h = io[j];

				for (int k = 0; k <= 0; k++) {

					if (h.charAt(i) == t) {

						count++;

					}

				}

			}

			if (count == 4) {

				results = results + t;
				count=0;
			
			}
			else {
				
				break;
			}

		}
		
		System.out.println(results);

	}

}
