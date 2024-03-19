package ShalendraSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		WebElement iop = driver.findElement(By.xpath("//div[@class='example']/button"));
		if (iop.isDisplayed()) {

			System.out.println("The button is displayed");

			String l = iop.getText();

			System.out.println(l);

		}

		else {

			System.out.println("The button is not displayed this is the fucntion of selenium");

		}

	}

}
