package Shalendra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestive {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * autosuggestive drop down
		 * 
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\ch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> tre = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		for (int i = 0; i <= tre.size() - 1; i++) {
			
			System.out.println(tre.get(i).getText());

		}
		
		driver.quit();

	}

}
