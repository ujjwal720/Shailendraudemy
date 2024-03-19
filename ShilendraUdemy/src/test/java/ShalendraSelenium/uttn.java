package ShalendraSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uttn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement ui=driver.findElement(By.xpath("(//ul)/li[1]/button"));
		Thread.sleep(3000);
		ui.click();
		Alert op=driver.switchTo().alert();
		String tre=op.getText();
		System.out.println(tre);
		
		

	}

}
