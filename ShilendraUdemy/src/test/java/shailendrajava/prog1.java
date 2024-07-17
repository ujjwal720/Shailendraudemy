package shailendrajava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.devtools.v117.io.IO;

public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    /*
	     * 2nd larget
	     */
		
		List<Integer> io=new ArrayList<Integer>();
		io.add(1);
		io.add(1);
		io.add(2);
		
		Collections.sort(io);
		
		Set<Integer> iom=new HashSet<Integer>(io);
		List<Integer> iomm=new ArrayList<Integer>(iom);
		
		int x=iomm.get(1);
		
		System.out.println(x);
		

	}

}
