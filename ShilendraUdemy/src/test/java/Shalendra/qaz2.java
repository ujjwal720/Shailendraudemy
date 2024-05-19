package Shalendra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qaz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * this is an reso format
		 */
		driver.get("https://formstone.it/components/checkbox/");
		List<WebElement> ioz = driver.findElements(By.xpath("//input[@type='radio']"));
		for (int i = 0; i <= ioz.size() - 1; i++) {
			
			if(ioz.get(i).isEnabled()) {
				
				
			}
			
			else {
				
				System.out.println(ioz.get(i).getAttribute("id"));
			}

		}

	}

}
