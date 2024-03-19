package Shalendra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement t_y = driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]/a"));
		t_y.click();
		Thread.sleep(2000);
		WebElement yu = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select a = new Select(yu);
		a.selectByIndex(5);
	    a.selectByVisibleText("Apr");
		

	}

}
