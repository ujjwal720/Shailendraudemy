package shailendrajava;

public class minimumdistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String io = "india is my country";
		String[] reesults = io.split(" ");
		String result2 = "";
		for (int i = 0; i <= reesults.length - 1; i++) {

			String l = reesults[i];
			String ws = "";

			for (int j = 0; j <= l.length() - 1; j++) {

				if (j == 0) {

					ws = ws + Character.toUpperCase(l.charAt(j));
				}

				else {

					ws = ws + l.charAt(j);

				}

			}
			
			result2=result2+ws+" ";

		}
		
		
		System.out.println(result2);

	}

}
