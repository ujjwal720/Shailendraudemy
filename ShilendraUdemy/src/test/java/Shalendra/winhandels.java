package Shalendra;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class winhandels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor drivers = ((JavascriptExecutor) driver);
		drivers.executeScript("window.scrollBy(0, 2000);");
		System.out.println("windows is scrolled by us");
		List<WebElement> uio = driver.findElements(By.xpath("//div[@id='gf-BIG']/table/tbody/tr[1]/td[1]/ul/li/a"));
		for (int i = 0; i <= uio.size() - 1; i++) {

			uio.get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));

		}

		Set<String> iu = driver.getWindowHandles();

		for (String r_m : iu) {
			
			driver.switchTo().window(r_m);
			System.out.println(driver.getTitle());

		}

	}

}
