package Shalendra;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class qw33 {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * irctc
		 */
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement enterdata = driver.findElement(By.xpath("(//input[@role='searchbox'])[1]"));
		enterdata.sendKeys("Mumbai");
		/*
		 * somatim data not get load fully
		 */
		Thread.sleep(4000);
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement start = driver.findElement(By.xpath("//ul[@role='listbox']/li[2]"));
		waits.until(ExpectedConditions.elementToBeClickable(start));
		WebElement start1 = driver.findElement(By.xpath("//ul[@role='listbox']/li[2]"));
		start1.click();
		List<WebElement> opl = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		for (int i = 0; i <= opl.size() - 1; i++) {
			
			System.out.println(opl.get(i).getText());
			/*
			 * stale element exception
			 */

		}

	}

}
