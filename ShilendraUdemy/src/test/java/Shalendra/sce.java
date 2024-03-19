package Shalendra;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * keybords interactions
		 */

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions i_u = new Actions(driver);
		i_u.keyDown(Keys.SHIFT).build().perform();
		search.sendKeys("fans");
		i_u.keyDown(Keys.SHIFT).build().perform();

	}

}
