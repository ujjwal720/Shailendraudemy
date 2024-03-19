package Shalendra;

import org.testng.annotations.Test;

public class grouptestcase {
	
	
	
	@Test(groups="smoke1",enabled=false)
	public void group1() {
		
		System.out.println("this is of group 1");
	}
	
	
	
	@Test(groups="smoke2")
	public void group2() {
		
		System.out.println("this is an group2");
	}

}
