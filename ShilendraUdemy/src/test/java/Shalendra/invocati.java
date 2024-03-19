package Shalendra;

import org.testng.annotations.Test;

public class invocati {
	
	
	/*
	 * This will basically run the test 3 times in the selenium which
	 * is very much hard but that is the invocation count
	 */
	
	@Test(invocationCount=3)
	public void msm() {
		
		System.out.println("This is an test");
		
	}

}
