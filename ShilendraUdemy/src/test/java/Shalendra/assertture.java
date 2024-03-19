package Shalendra;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertture {

	@Test
	public void ui() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		SoftAssert op = new SoftAssert();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement io = driver.findElement(By.xpath("(//label[@class='oxd-label'])[1]"));
		boolean oi = io.isDisplayed();
		AssertJUnit.assertTrue(oi);
		AssertJUnit.assertFalse(oi);
		AssertJUnit.assertTrue(oi);
		op.assertAll();

	}

}
