package seleniumpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * new tab
		 */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click();
		Set<String> yuz = driver.getWindowHandles();
		for (String l : yuz) {

			driver.switchTo().window(l);
			System.out.println(l);

		}

	}

}
