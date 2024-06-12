package shailendrajava;

public class validateip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "222.111.111.111";
		String[] l = a.split("\\.");
		int count=0;
		if (l.length == 4) {

			for (int i = 0; i <= l.length - 1; i++) {
				
				
				try {
				
				if (Integer.parseInt(l[i]) >= 0 && Integer.parseInt(l[i]) <= 255) {
					count++;
				}
				}
				catch(NumberFormatException e) {
                    
                      return false;
                }
			}
			
			if(count==4) {
				
				System.out.println("valid count");
				
				
			}
			
			else {
				System.out.println("not valid");
			}

		}

	}

}
