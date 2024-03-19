package Shalendra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class qae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\ch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Actions l=new Actions(driver);
		l.contextClick(driver.findElement(By.xpath("//textarea[@class='gLFyf']"))).build().perform();
		System.out.println("right click has been clciked");

	}

}
