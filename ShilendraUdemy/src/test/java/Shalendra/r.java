package Shalendra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class r {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\ch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjnv9eZ15mDAxVsZmwGHSwZBo8QPAgJ");
	    Actions a=new Actions(driver);
	    WebElement io=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	    a.contextClick(io).build().perform();
	    System.out.println("now the mouse has been clicked here");
	    /*
	     * this is for the automation testing 
	     * here which we are seeing
	     */
	    

	}

}
