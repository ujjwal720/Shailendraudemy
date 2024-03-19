package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.eviltester.com/styled/alerts/fake-alert-test.html");
		/*
		 * modals
		 */
	    driver.findElement(By.xpath("(//input[@class='styled-click-button'])[2]")).click();
	    
	    Thread.sleep(2000);
	    
	    WebDriverWait z=new WebDriverWait(driver,Duration.ofSeconds(20));
	    
	    WebElement modalbutton=driver.findElement(By.xpath("//button[@id='dialog-ok']"));
	    
	    z.until(ExpectedConditions.visibilityOf(modalbutton));
	    
	    modalbutton.click();
	    
	    System.out.println("****the following button is clicked****");
	    
	    
	    
	          
	}

}
