package Shalendra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestediframeinselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		WebElement ui = driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(ui);
		Thread.sleep(3000);
		WebElement tyr = driver.findElement(By.xpath("(//frameset[@name='frameset-middle']/frame)[1]"));
		driver.switchTo().frame(tyr);
		System.out.println("its completed");
	

	}

}
