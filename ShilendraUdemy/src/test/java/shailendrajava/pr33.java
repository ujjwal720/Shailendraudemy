package shailendrajava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pr33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * stock buy and sell problem
		 */
        int max=0;
         int day1=0;
         int day2=0;
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		List<Integer> io = new ArrayList<Integer>();

		for (int i = 0; i <= prices.length - 1; i++) {

			io.add(prices[i]);

		}

		for (int i = 0; i <= prices.length - 1; i++) {

			for (int j = i + 1; j <= prices.length; j++) {
           try {
				if (io.get(i) < io.get(j)) {
					
					int c=io.get(j)-io.get(i);
					
					if(c>max) {
						day1=i+1;
						max=c;
						day2=j+1;
						/*
						 * 2 or 5
						 */
						
					}

				}
				
           }
           
           catch(Exception e) {
        	   
        	   
           }

			}
			
			System.out.println(day1);
			System.out.println(day2);

		}

	}

}
