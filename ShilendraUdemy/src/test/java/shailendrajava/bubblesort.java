package shailendrajava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stubt

		Integer[] x = {10,9,11,6,15,2};
		
		/*
		 * swap 
		 */
     
		for (int i = 0; i <= x.length - 1; i++) {

			for (int j = 0; j <= x.length - 1 - 1; j++) {

				if (x[j] > x[j + 1]) {
					
					/*
					 * swap numbers
					 */
					
					int temp=x[j];
					int temp2=x[j+1];
					
					x[j+1]=temp;
					x[j]=temp2;
					
					temp=0;
					temp2=0;
					
					
					
					
					
					
					
					
					
					

				}

			}
			
			
			
			
			
		}
		
		List<Integer> sort=new ArrayList<Integer>();
		
		sort=Arrays.asList(x);
		
		
		System.out.println(sort);

	}

}
