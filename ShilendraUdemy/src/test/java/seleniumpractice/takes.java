package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class takes {
	
	
	@Test(dataProvider="datas")
	public void ms(String s) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(s);
		driver.quit();
		
		
		
		
		
	}
	
	
	
	
	
	@DataProvider
	public Object[] datas() {
		
		
		Object[] a= {"Ram","krishna"};
		
		return a;
		
		
		
	}

	
	
	
	
	
	
}
