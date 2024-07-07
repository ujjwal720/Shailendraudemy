package shailendrajava;

public class er {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "GeeksForGeeks";
		String b = "ForGeeksGeeks";
		int count=0;
		
		for(int i=0;i<=a.length()-1;i++) {
			
			if(a.charAt(i)!=b.charAt(i)) {
               
				count++;
            }
		}
		
		System.out.println(count);

	}

}
