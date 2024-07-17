package shailendrajava;

import java.util.ArrayList;
import java.util.List;

public class removestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String yu = "One two three four";
		String target = "two";
		yu.charAt(0);
		Character.toUpperCase(0);
		List<String> io = new ArrayList<String>();
		String results = "";

		String[] yu1 = yu.split(" ");

		for (int i = 0; i <= yu1.length - 1; i++) {

			if (!yu1[i].equals(target))
				io.add(yu1[i]);

		}

		for (int j = 0; j <= io.size() - 1; j++) {
			
			results += io.get(j) + " ";

		}
		
		System.out.println(results.trim());

	}

}
