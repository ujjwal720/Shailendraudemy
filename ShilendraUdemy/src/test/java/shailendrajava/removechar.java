package shailendrajava;

public class removechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string1 = "computer";
		String string2 = "cat";
		String result = "";
		for (int i = 0; i <= string2.length() - 1; i++) {

			string1 = string1.replace(string2.charAt(i), '?');

		}

		for (int j = 0; j <= string1.length() - 1; j++) {
			
			if (string1.charAt(j)!= '?') 
			
			{
				
				result = result + string1.charAt(j);
			}

		}
		
		System.out.println(result);

	}

}
