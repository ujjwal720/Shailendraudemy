package shailendrajava;

public class java12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * recursion first without for loop print name
		 * 
		 * 
		 */
		
		xyz a=new xyz();
		a.name("Ujjwal");
		

	}

	

	

}

class xyz{
	int count = 0;
	public String name(String s) {
	
		if (count == 5) {

			return "Done";
		}

		count++;

		System.out.println(s);
		return name(s);

	}
	
	
	
	
	
}
