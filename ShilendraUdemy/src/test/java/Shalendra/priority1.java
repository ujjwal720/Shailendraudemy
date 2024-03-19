package Shalendra;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class priority1 {

	@Test(groups="smoke")
	public void ui() {

		System.out.println("This is an ui test");

	}
	
	
	/*
	 * the testng priority is basically
	 * based on that
	 */

	@Test(groups="amoke2")
	public void uim() {

		System.out.println("This is an smoke 2 test");

	}

}
