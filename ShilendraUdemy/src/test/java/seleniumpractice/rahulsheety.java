package seleniumpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahulsheety {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		 * window handels
		 */
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		WebElement target=driver.findElement(By.xpath("(//button[@class='whButtons'])[2]"));
		target.click();
		Thread.sleep(2000);
		
		Set<String> jm=driver.getWindowHandles();
		
	    Iterator<String>  yz= jm.iterator();
	    
	    while(yz.hasNext()) {
	    	
	    	
	    	String l=yz.next();
	    	driver.switchTo().window(l);
	    	Thread.sleep(3000);
	    	System.out.println(driver.getTitle());
	    }
	    
	    
	    
	    
		
		
		
		
		

	}

}
