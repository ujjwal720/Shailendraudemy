package ShalendraSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderpracticeselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        String yearm="2028";
        String month="August 2028";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		WebElement button = driver.findElement(By.xpath(
				"//button[@class='react-date-picker__calendar-button react-date-picker__button']//*[name()='svg']"));
		button.click();
		/*
		 * now again clicking on the slect the month of the following
		 */

		WebElement year = driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']"));

		year.click();
		Thread.sleep(2000);

		year.click();
		
		WebElement d=driver.findElement(By.xpath("//button[normalize-space()='"+yearm+"']"));
		
        d.click();
        
        /*
         * select moth
         */
        
        WebElement f=driver.findElement(By.xpath("//abbr[@aria-label='"+month+"']"));
        
        f.click();
        
        /*
         * previous month date
         */
        
        
        WebElement prev=driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__prev-button']"));
        
        prev.click();
        
        /*
         * month
         */
        
        WebElement dates=driver.findElement(By.xpath("//abbr[@aria-label='July 17, 2028']"));
        
        dates.click();
        
        /*
         * this is for the calender automation in selenium which is pretty much 
         * manual i think 
         */
		
		

	};

}
