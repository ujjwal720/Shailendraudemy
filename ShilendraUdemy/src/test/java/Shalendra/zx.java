package Shalendra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class zx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ,ouse hover selenium
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\ch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		WebElement re=driver.findElement(By.xpath("//div[@class='nav-line-1-container']/span"));
		Actions m_s=new Actions(driver);
		m_s.moveToElement(re).build().perform();
		
		

	}

}
