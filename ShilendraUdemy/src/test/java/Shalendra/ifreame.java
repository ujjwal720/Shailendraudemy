package Shalendra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifreame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/dialog/");
		WebElement uio=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(uio);
		WebElement ty=driver.findElement(By.xpath("//div[@id='dialog']/p"));
		String l=ty.getText();
		Thread.sleep(2000);
		System.out.println(l);
		driver.switchTo().defaultContent();
		System.out.println("Driver is witch to default content");
		
		
		

	}

}
