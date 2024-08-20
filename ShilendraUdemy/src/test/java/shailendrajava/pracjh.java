package shailendrajava;

public class pracjh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub*

		/*
		 * 
		 * 
		 * */

		String s = "Ujjwal Shrivastava";

		String[] p = s.split(" ");

		String resultant = "";

		for (int i = 0; i <= p.length - 1; i++) {
			
			if(i<p.length-1) {
			resultant=resultant+p[i].charAt(0)+".";
			
			}
			else {
				
				resultant=resultant+p[i].charAt(0);
				
			}
			
			

		}
		
		System.out.println(resultant);
	}

}
