package Shalendra;

public class rew {

	int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rew a=new rew();
		a.withoutforloop("Ujjwal");

	}

	public void withoutforloop(String s) {

		
		if (count >= 5) {
			
	        return;
			
			

		}
		count++;
		
		System.out.println(s);
		withoutforloop("Ujjwal");

	}

}
