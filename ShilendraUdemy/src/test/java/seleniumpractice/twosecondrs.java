package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class twosecondrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html#google_vignette");
		Select a=new Select(driver.findElement(By.xpath("//select[@id='ide']")));
		a.selectByIndex(2);
		System.out.println("itesm is selected");
		
		

	}

}
