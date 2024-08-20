package shailendrajava;

import java.util.HashSet;
import java.util.Set;

public class ree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2nd largets of the element or k largest
		 */

		int[] a = { 1, 2, 4 ,89,76,45,33,83};
		int count = 1;
		int largest = 3;
		int point=0;

		while (count <= largest) {
			
			int max=a[1];
			for(int i=0;i<=a.length-1;i++) {
				
				if(max<a[i]) {
					point=i;
					max=a[i];
				}
				
				
				
				
				
			}
			
			if(count==largest) {
				
				System.out.println("The following i9s an max element for the following"+ " "+max);
			}
			
			a[point]=-1;
			
			count++;

		}

	}

}
