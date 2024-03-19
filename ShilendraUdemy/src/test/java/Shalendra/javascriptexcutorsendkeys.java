package Shalendra;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexcutorsendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		JavascriptExecutor iu=((JavascriptExecutor)driver);
		WebElement ui=driver.findElement(By.xpath("//input[@id='username']"));
		iu.executeScript("arguments[0].value = 'Ujjwal'", ui);
		
		
		
		
		
		

	}

}
