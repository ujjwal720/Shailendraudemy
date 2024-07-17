package shailendrajava;

public class we {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] io = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };
		int max = io[0].length();
		int z=0;

		for (int i = 0; i <= io.length - 1; i++) {
			
			if(max<io[i].length()) {
				
				max=io[i].length();	
				z=i;
			}
			
			

		}
		
		System.out.println(io[z]);

	}

}
