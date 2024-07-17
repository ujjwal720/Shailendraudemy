package shailendrajava;

public class sd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * nearest multiple of 10
		 */
       String iu="27";
       
		int num = Integer.parseInt(iu);
		int d = num;
		int m = num;

		while (true) {

			int x = d % 10;
			int y = m % 10;
			
            if(x==0 && y==0) {
		        Integer.toString(m);
				System.out.println("nearest multiple of 10: " + d);
				break;
			}

            else if(x==0) {
				
				System.out.println("nearest multiple of 10: " + d);
				break;
			}
			
            else if(y==0) {
				System.out.println("nearest multiple of 10: " + m);
				break;
			}
			
			

			d--;
			m++;

		}

	}

}
