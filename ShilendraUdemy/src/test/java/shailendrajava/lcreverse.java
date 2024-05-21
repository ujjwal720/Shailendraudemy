package shailendrajava;

import java.util.ArrayList;
import java.util.List;

public class lcreverse {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char[] l= {'h','e','e','l','l','o'};
	    List<String> chars=new ArrayList<String>();

        for(int i=l.length-1;i>=0;i--){

            chars.add(Character.toString(l[i]));

        }
        
        System.out.println(chars);
        
      

	}

}
