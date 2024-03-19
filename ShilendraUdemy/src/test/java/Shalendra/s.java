package Shalendra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class s {

	@Test
	public void xm() {

		System.setProperty("webdriver.chrome.driver", "C:\\ch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait iop=new WebDriverWait(driver,Duration.ofSeconds(30));
		iop.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']")));
		
		WebElement yu = driver.findElement(By.xpath("//div[@id='finish']"));
	
	
		if(yu.isDisplayed()) {
			
			System.out.println("The lement is displayed");
		}
		
		else {
			
			System.out.println("Element s not displayed");
		}

	}

}
