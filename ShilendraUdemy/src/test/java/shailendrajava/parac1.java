package shailendrajava;

public class parac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parac1 v=new parac1();
		int y=v.factorial(5);
	   System.out.println(y3
			   );

	}

	/*
	 * factorial
	 * 
	 * stack how it is geeting full here
	 * 
	 * factoril(0)
	 * factorial(1)
	 * factorial(2)
	 * factorial(3)
	 * factorial(4)
	 * factorial(5)
	 * 
	 * 
	 */

	public int factorial(int x) {
		
		if(x==0) {
			
			return 1;
			
		}
		
		int sum= factorial(x-1)*x;
		return sum;

	}

}
