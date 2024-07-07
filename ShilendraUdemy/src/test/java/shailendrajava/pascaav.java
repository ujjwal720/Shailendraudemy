package shailendrajava;

import java.util.ArrayList;
import java.util.List;

public class pascaav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int col = 5;
		int row = 5;

		System.out.print(1);
		System.out.println();
		System.out.print(1);
		System.out.print(1);
		System.out.println();
		List<Integer> io = new ArrayList<Integer>();
		List<Integer> iom = new ArrayList<Integer>();
		io.add(1);
		io.add(1);

		for (int i = 3; i <= col; i++) {
			iom.add(1);
			int count=0;
	        
			for (int j = 1; j <= row; j++) {

				if (j == 1) {

					System.out.print(1);
				}

				else if (j == i) {
					
					System.out.print(1);

				}

				else if ((j >= 1 && j <= i) && (j != 1 || j != i)) {
					

                    try {
                    	
                    	int sum=io.get(count)+io.get(count+1);
                    	System.out.print(sum);
                    	iom.add(sum);
                    	count++;
                    	
                    	
                    }  
                    
                    catch(Exception e) {
                    	
                    	
                    	e.printStackTrace();
                    	
                    	
                    }
					        

					
					
				

				}

				else {

					System.out.print("");
				}

			}
			iom.add(1);
			System.out.println();
			io=new ArrayList<Integer>();
			io=iom;
			iom=new ArrayList<Integer>();

		}

	}

}
