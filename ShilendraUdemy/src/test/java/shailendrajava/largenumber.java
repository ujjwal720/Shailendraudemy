package shailendrajava;

public class largenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "678914";
		String d = "678121";
		int carry = 0;
		String resultant = "";
		String resultsm="";
		if (s.length() == d.length()) {

			for (int i = s.length() - 1; i >= 0; i--) {

				if (i == 0) {

					int x = Integer.parseInt(Character.toString(s.charAt(i)));
					int y = Integer.parseInt(Character.toString(d.charAt(i)));
					int results = x + y + carry;
					String io = Integer.toString(results);
					resultant = resultant + "," + results;
					break;
				}

				int x = Integer.parseInt(Character.toString(s.charAt(i)));
				int y = Integer.parseInt(Character.toString(d.charAt(i)));

				int results = x + y + carry;
				String[] ui = Integer.toString(results).split("");
				if (results > 9 && i != 0) {

					String res = ui[1];
					resultant = resultant + res;

				}

				else {

					String res = ui[0];
					resultant = resultant + res;

				}

				if (x + y > 9) {

					int t = x + y;
					String value = Integer.toString(t);
					String[] l = value.split("");
					carry = Integer.parseInt(l[0]);

				}

				else {
					carry = 0;
				}

			}

		}

		String[] l = resultant.split(",");
		
		StringBuilder im=new StringBuilder(l[0]);
		
		String rev=im.reverse().toString();
		
		resultsm=resultsm+l[1]+rev;
		
		System.out.println(resultsm);
		
		

	}

}
