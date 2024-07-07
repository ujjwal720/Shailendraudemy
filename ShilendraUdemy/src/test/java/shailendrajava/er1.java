package shailendrajava;

public class er1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		er1 obj = new er1();
        
        obj.sm(5);

	}
	
	/*
	 * recursion
	 */
	
	
	public void sm(int n) {
		
		if(n==1) {
			
			System.out.println(1);
			return;
		}
		
		sm(n-1);
		System.out.println(n);
		
		
		
		
		
	}

}
