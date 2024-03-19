package Shalendra;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyschorrrr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		 * selecting the text with selenium blue one
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\ch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjnv9eZ15mDAxVsZmwGHSwZBo8QPAgJ");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Tshirts",Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.chord(Keys.ENTER));
	    WebElement tr=driver.findElement(By.xpath("//div[@id='result-stats']"));
	    tr.sendKeys(Keys.chord(Keys.ENTER,"a"));
	    Thread.sleep(2000);
	    

	}

}
