package shailendrajava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * dropdown
		 */

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		List<WebElement> i_o = driver.findElements(By.xpath("(//select[@class='col-lg-3'])[1]/option"));
		for (int i = 0; i <= i_o.size() - 1; i++) {
			
			System.out.println(i_o.get(i).getText());

		}

	}

}
