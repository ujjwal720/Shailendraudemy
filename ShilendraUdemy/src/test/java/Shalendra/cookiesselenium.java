package Shalendra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cookiesselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wedolaundry.ca/gift-cards");
		WebDriverWait uyt = new WebDriverWait(driver, Duration.ofSeconds(20));
		uyt.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='myConsent']/div/div/a)[1]")));
		Thread.sleep(2000);
		WebElement rew = driver.findElement(By.xpath("(//div[@id='myConsent']/div/div/a)[1]"));
		rew.click();
		/*
		 * Now ,ain target is to click that webelemetn in one go
		 */
		JavascriptExecutor uiop=((JavascriptExecutor)driver);
		WebElement giftcards = driver.findElement(By.xpath("//button[@type='submit']"));
		uiop.executeScript("arguments[0].scrollIntoView(true);", giftcards);
		uiop.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(3000);
		uiop.executeScript("arguments[0].click",giftcards);
		giftcards.click();

	}

}
