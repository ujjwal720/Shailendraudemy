package Shalendra;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ch\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjnv9eZ15mDAxVsZmwGHSwZBo8QPAgJ");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Tshirts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.chord(Keys.ENTER));
		/*
		 * now to fetch the number in results
		 */
		
		String tui=driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
		//System.out.println(tui);
		String[] yt=tui.split(" ");
		System.out.println("The number of results is as follows which are like that"+" "+yt[1]);

	}

}
