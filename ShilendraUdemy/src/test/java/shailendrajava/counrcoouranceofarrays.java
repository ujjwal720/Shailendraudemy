package shailendrajava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class counrcoouranceofarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 1, 1, 3, 2 };

		List<Integer> b = new ArrayList<Integer>();

		for (int i = 0; i <= a.length - 1; i++) {

			b.add(a[i]);

		}

		Set<Integer> k = new HashSet<Integer>(b);
		List<Integer> xc = new ArrayList<Integer>(k);

		for (int i = 0; i <= xc.size() - 1; i++) {
			
			int count=0;

			for (int j = 0; j <= b.size() - 1; j++) {
				
				if(xc.get(i)==b.get(j)) {
					
					
					count++;
				}

			}
			
			System.out.println("The count for the following is"+" "+xc.get(i)+" "+count);

		}

	}

}
