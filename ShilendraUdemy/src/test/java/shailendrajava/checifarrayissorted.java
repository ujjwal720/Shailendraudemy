package shailendrajava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class checifarrayissorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30, 50, 40 };
		int count = 0;
		List<Integer> io = new ArrayList<Integer>();

		for (int i = 0; i <= arr.length - 1; i++) {

			io.add(arr[i]);

		}

		List<Integer> im = new ArrayList<Integer>(io);

		Collections.sort(io);

		for (int i = 0; i <= io.size() - 1; i++) {

			if (im.get(i) == io.get(i)) {

				count++;

			}

		}

		if (count == im.size()) {

			System.out.println("Array is sorted");
		}

		else {
			
			System.out.println("Array is not sorted");

		}

	}

}
