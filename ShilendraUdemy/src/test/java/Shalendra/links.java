package Shalendra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		try {
			WebElement re = driver.findElement(By.xpath("//div[@class='_6ltj']/a"));
			if (re.isDisplayed() == false) {

				System.out.println("Forgotten password link is dipalyed wow");

			} else {

				System.out.println("Forgetten password link is not displayed so sad");

			}
		} catch (Exception e) {
			
			e.printStackTrace();

		}

	}

}
