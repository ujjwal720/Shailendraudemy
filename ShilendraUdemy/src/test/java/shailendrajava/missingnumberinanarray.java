package shailendrajava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class missingnumberinanarray {

	public static Integer main(String[] args) {
		// TODO Auto-generated method stubnew ArrayList<

		int[] array = {6,1,2,8,3,4,7,10,5};
		List<Integer> num = new ArrayList<Integer>();

		for (int i = 0; i <= array.length - 1; i++) {

			num.add(array[i]);

		}

		Collections.sort(num);

		int digit = num.get(num.size() - 1);
		int digit2 = num.get(0);
		List<Integer> im = new ArrayList<Integer>();
		for (int i = digit2; i <= digit; i++) {

			im.add(i);

		}

		for (int i = 0; i <= im.size() - 1; i++) {

			if (im.get(i) != num.get(i)) {
				
				return im.get(i);
		

			}

		}
		
		return null;

	}

}
