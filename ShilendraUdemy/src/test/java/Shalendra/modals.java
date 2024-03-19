package Shalendra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class modals {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\ch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice-automation.com/modals/");
		driver.findElement(By.id("simpleModal")).click();
		WebElement re=driver.findElement(By.xpath("(//div[@class='pum-content popmake-content'])[2]/p"));
		Thread.sleep(2000);
		System.out.println(re.getText());
		

	}

}
