package shailendrajava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class roatte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "gbcdfefgggg";
		String[] l = s.split("");
		List<String> i = Arrays.asList(l);

		Collections.sort(i);
		
		System.out.println(i);
		
		

	}

}
