package Shalendra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class GiftcardCases {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://tender-goldberg-6c9be4.netlify.app/gift-cards");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	// TestCases for recipient info section
	@Test
	public void name1() throws InterruptedException 
	{
		WebElement firstname = driver.findElement(By.id("rname"));
		firstname.isEnabled();
		firstname.sendKeys("Test");
		
//		WebElement btn = driver.findElement(By.xpath("//*[contains(text(),'Send Gift Card')]"));
//		btn.isEnabled();
//		btn.click();
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0, 1000)","");
		WebElement re=driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(2000);
		re.click();
		
		
//		Actions actions = new Actions(driver);
//		WebElement btn = driver.findElement(By.xpath("//*[contains(text(),'Send Gift Card')]"));
//		actions.click(btn).build().perform();
		
		
		WebElement errormsg = driver.findElement(By.xpath("(//label[@class='error'])[1]"));
		if (errormsg.isDisplayed() ) 
		{
			System.out.println("Test- 1 Fails");
			
		} else 
		{
			System.out.println("Test- 1 pass");

		}
		
		
		
	}
	
	
	
	
	@AfterMethod
	public void teardown() 
	{
		//driver.quit();
		
		
	}

}