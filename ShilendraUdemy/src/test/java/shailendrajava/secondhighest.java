package shailendrajava;

import java.util.ArrayList;
import java.util.List;

public class secondhighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] x= {1,3,2,6,4};
		/*
		 * second highest
		 */
		
		List<Integer>  iz=new ArrayList<Integer>();
		int largest=3;
		int count=1;
		int num=0;
		
		
		for(int i=0;i<=x.length-1;i++) {
			
			iz.add(x[i]);
			
			
			
		}
		
		int max=iz.get(0);
		
		while(count<=largest) {
			
		    
			for(int i=0;i<=iz.size()-1;i++) {
				
				if(max<iz.get(i)) {
					
					max=iz.get(i);
				}
				
				
			}
			
			num=max;
			
			iz.remove(iz.indexOf(max));
			
			max=iz.get(0);
			
			count++;
			
			
		}
		
		System.out.println(num);
		
		
		
		
		
	
		
		

	}

}
