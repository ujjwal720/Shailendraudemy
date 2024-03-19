package Shalendra;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class newtabselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.xpath("//table[@class='gf-t']/tbody/tr[1]/td[1]/ul/li/a"));
		JavascriptExecutor exe=((JavascriptExecutor)driver);
		exe.executeScript("window.scrollBy(0, 2000);");
		Thread.sleep(3000);
		for (int i = 0; i <= links.size() - 1; i++) {
			
		   String s=links.get(i).toString();
		   links.get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
		   }
		
		
		   Set<String>  i_o=driver.getWindowHandles();
		   
		  for(String k:i_o) {
			  
			  driver.switchTo().window(k);
			  Thread.sleep(2000);
			  System.out.println(driver.getTitle());
			  
			  
			  
		  }
		   
		   

	}

}
