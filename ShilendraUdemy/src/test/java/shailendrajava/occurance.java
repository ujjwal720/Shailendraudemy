package shailendrajava;

import java.util.HashMap;
import java.util.Map;

public class occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  x= {1,2,3,4,5,6,71,2,};
		Map<Integer,Integer> io=new HashMap<Integer,Integer>();
		
		for (int i = 0; i <= x.length-1; i++) {
			
			
			if(io.containsKey(x[i])) {
                io.put(x[i], io.get(x[i])+1);
            }else {
                io.put(x[i], 1);
            }			
			
			
		}
		
		System.out.println(io);

	}

}
