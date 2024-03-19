package shailendrajava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> op = driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr"));
		System.out.println(op.size() + " " + "this are the total rows");
		List<WebElement> iu = driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr/th"));

		for (int i = 0; i <= op.size() - 1; i++) {
	
			List<WebElement> ium = driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr[" + (i+1) + "]/td"));
			if(i==2) {

			for (int j = 0; j <= ium.size() - 1; j++) {
				
				System.out.println(ium.get(j).getText());
				
			}
			
			}

		}

	}

}
