package Shalendra;

import java.util.ArrayList;
import java.util.List;

public class createtwopairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		List<Integer> io=new ArrayList<Integer>();
		
		/*
		 * lets create the two pais for all the following program
		 */

		for (int i = 0; i <= a.length - 1 - 1; i++) {

			List<Integer> l = new ArrayList<Integer>();

			for (int j = i; j <= i + 1; j++) {
				
				     l.add(a[j]);

			}
			
			

		}

	}

}
