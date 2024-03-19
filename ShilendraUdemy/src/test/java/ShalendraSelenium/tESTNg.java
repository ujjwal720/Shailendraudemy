package ShalendraSelenium;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tESTNg {

	@Test(singleThreaded=true)
	public void firstTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		/*
		 * Assertuiom
		 */

		String tittle = driver.getTitle();

		String exp = "gl";

		AssertJUnit.assertEquals(tittle, exp);

	}



	@Test(singleThreaded=true)
	public void firstsTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		/*
		 * Assertuiom
		 */

		String tittle = driver.getTitle();

		String exp = "gl";

		AssertJUnit.assertEquals(tittle, tittle);

	}

}
