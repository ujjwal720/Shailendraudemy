package shailendrajava;

public class ewqe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "India is my country";

		String[] p = s.split(" ");

		String results = "";
		
		StringBuilder po=new StringBuilder();
		
		
		

		for (int i = 0; i <= p.length - 1; i++) {

			if (i < p.length) {

				po= new StringBuilder(p[i]);

				String t = po.reverse().toString();

				results = results + t + " ";

			}

			else {
				
				po= new StringBuilder(p[i]);
				
				String t = po.reverse().toString();
				
				results = results + t;
				
				

			}

		}
		
		
		System.out.println(results);

	}

}
