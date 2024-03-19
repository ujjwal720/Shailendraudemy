package Shalendra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alerts {

	@Test
	public void start() {
		System.setProperty("webdriver.chrome.driver", "C:\\ch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice-automation.com/popups/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		/*
		 * to accept the alert
		 */
	    driver.switchTo().alert().accept();
	    String l=driver.switchTo().alert().getText();
	    System.out.println(l);
		

	}

}
