package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploaddownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		 * input type file upload using excel
		 */
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@id='downloadButton']")).click();
		Thread.sleep(2000);
		String path="C:\\Users\\DELL\\Downloads\\download.xlsx";
		WebElement upload=driver.findElement(By.xpath("//input[@type='file']"));
		upload.sendKeys(path);
		Thread.sleep(2000);
		
		

	}

}
