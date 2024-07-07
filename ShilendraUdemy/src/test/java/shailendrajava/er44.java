package shailendrajava;

public class er44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * recursion
		 */
		er44 a=new er44();
        a.sm(1);
		
		

	}
	
	
	public void sm(int n) {
		
		
		if(n==5) {
			
			System.out.println(n);
			return;
		}
		
		
		sm(n+1);
		System.out.println(n);
		
		
	}

}
