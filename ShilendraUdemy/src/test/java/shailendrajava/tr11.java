package shailendrajava;

public class tr11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abba";
		StringBuilder r = new StringBuilder(s);
		String j = r.reverse().toString();
		if (j.equals(s)) {

			System.out.println("It is plandrome");

		}

		else {
			
			System.out.println("it is not");

		}

	}

}
