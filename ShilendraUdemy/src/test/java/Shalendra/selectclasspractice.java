package Shalendra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectclasspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * select class pratice
		 */

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/auto-complete");
		driver.findElement(By.xpath("//input[@id='autoCompleteMultipleInput']")).sendKeys("bl");
		List<WebElement> izo = driver.findElements
				(By.xpath("//div[@class='auto-complete__menu-list auto-complete__menu-list--is-multi css-11unzgr']/div"));
		
		for (int i = 0; i <= izo.size() - 1; i++) {
			
			System.out.println(izo.get(i).getText());

		}

	}

}
