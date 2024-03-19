package Shalendra;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class testresult {

	@Test
	public void ms() {

		Assert.assertEquals("ram", "ram3");

	}

	@AfterMethod
	public void as(ITestResult m) {

		System.out.println(m.getStatus());

	}
}
