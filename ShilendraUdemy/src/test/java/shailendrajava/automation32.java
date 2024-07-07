package shailendrajava;

public class automation32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * how many people can with th people and required capacity
		 */

		int peo = 20;
		int boat = 30;
		int sum = 0;
		int count = 0;

		while (sum <= peo) {

			sum = sum + boat;
			count++;
		}
		
		System.out.println("The trips which boat has to make is"+" "+count);

	}

}
