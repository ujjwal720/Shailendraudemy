package shailendrajava;

public class uy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String l = "lets play the hockey";
		String[] p = l.split(" ");
		int max=p[0].length();
		String result="";
		for(int i=0;i<=p.length-1;i++) {
			
	    if(max<p[i].length()) {
	    	
	    	max=p[i].length();
	    	
	    	result=p[i];
	    	
	    	
	    }
			
			
			
			
		}
		
		
		
		System.out.println(result);
		

	}

}
