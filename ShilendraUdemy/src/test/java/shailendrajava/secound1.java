package shailendrajava;

public class secound1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 0;
		int count = max;
		int p = 0;
		
		/*
		 * maximum by length this is the geeks for geeks
		 */
		String[] names = { "Geek", "Geek", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };

		for (int i = 0; i <= names.length - 1; i++) {

			if (max < names[i].length()) {

				max = names[i].length();

				p = i;
			}

		}

		System.out.println(names[p]);

	}

}
