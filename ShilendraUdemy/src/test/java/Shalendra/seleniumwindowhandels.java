package Shalendra;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumwindowhandels {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/");
		Thread.sleep(2000);
		List<WebElement> ui = driver.findElements(By.xpath("(//ul[@class='navigation clearfix'])[1]/li/a"));
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		for (int i = 0; i <= ui.size() - 1; i++) {

			ui.get(i).sendKeys(selectLinkOpeninNewTab);
			Thread.sleep(3000);

		}

		Set<String> op = driver.getWindowHandles();

		System.out.println("This many tabs are opened in current session in selenium" + " " + op.size());

	}

}
