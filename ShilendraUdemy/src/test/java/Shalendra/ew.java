package Shalendra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ew {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		 * the navigate command basically used to do the to and fro of the web elements in the selenium
		 * with navigate we can basically go forwad and back in selenium
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\ch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjnv9eZ15mDAxVsZmwGHSwZBo8QPAgJ");
	    Thread.sleep(2000);
	    driver.navigate().back();
		driver.manage().window().maximize();
	

	}

}
