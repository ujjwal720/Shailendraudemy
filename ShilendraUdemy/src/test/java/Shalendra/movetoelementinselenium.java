package Shalendra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetoelementinselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		Actions as=new Actions(driver);
		WebElement target=driver.findElement(By.xpath("//div[@class='nav-line-1-container']/span"));
		as.moveToElement(target).build().perform();
		System.out.println("Move to element is succeded so just enjot the game");
		
		

	}

}
