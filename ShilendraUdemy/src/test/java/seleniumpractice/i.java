package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * open new tab
		 */

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		String l=Keys.chord(Keys.CONTROL,Keys.ENTER);
		WebElement newtab=driver.findElement(By.xpath("(//div[@class='nav-progressive-content'])[2]/a[1]"));
		newtab.sendKeys(l);
		/*
		 * open in new tab selenium
		 */
		
		
		
		
		
	}

}
