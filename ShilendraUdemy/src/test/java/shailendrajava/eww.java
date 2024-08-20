package shailendrajava;

public class eww {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * coding question for the following 
		 */
		
		
		d a=new d();
		a.wheels();
		
		
		
		
	

	}

}



	
	
	
 abstract class car{
	
	
	public car() {
		
		System.out.println("The following has four wheels");
	}
	
	
	public void drive() {
		
		
		System.out.println("drive");
	}
	
	
	public abstract void wheels();
	
	
	
}


class d extends car{

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("it has four wheels");
	}
	
	
	
}


