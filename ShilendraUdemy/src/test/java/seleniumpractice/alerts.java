package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * alerts in accept mode
		 */
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		driver.switchTo().alert().accept();
		
		System.out.println("This is an alert to accept in the javascript mode");
	   
		
		

	}

}
