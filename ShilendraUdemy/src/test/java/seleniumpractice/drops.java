package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		Actions abc=new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement source=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']/img)[1]"));
		WebElement target=driver.findElement(By.xpath("//div[@id='trash']"));
		abc.dragAndDrop(source, target).build().perform();
		System.out.println("This is drag and drop");
		

	}

}
