package shailendrajava;

public class tre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * automation
		 * 
		 * palindrome function
		 */

	}

	public boolean palindrome(String actual) {

		String reverse = new StringBuilder(actual).reverse().toString();

		if (reverse == actual) {
			
			return true;

		}
		
		else {
			
			return false;
		}

	}

}
