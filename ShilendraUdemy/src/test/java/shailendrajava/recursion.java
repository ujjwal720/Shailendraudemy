package shailendrajava;

public class recursion {
	String f = "";
	public static int i =0;

	/*
	 * recursion its an programing tecjnique in which the function called itself
	 * this is the programing
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pal = "Ujjwal";
		recursion a=new recursion();
		String l=a.revese(i, pal.length()-1, pal);
		System.out.println(l);

	}

	public String revese(int i, int j, String s) {

		if (i > s.length() || j==-1) {

			return f;
		}

		i++;
		f = f+ s.charAt(j);
		j--;
		return revese(i, j, s);

	}

}
