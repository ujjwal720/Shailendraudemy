package shailendrajava;

public class splitnames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Ujjwal Shrivastava";

		String[] ios = s.split(" ");
		
		
		
		String resultant="";

		for (int i = 0; i <= ios.length-1-1; i++) {
			
			
			resultant=resultant+ios[i].charAt(0)+".";
			

		}
		
		
		resultant=resultant+ios[ios.length-1];
		
		
		System.out.println(resultant);

	}

}
