package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioobuutons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		List<WebElement> im = driver.findElements(By.xpath("//div[@id='commonWebElements']/form[1]/input"));
		for (int i = 0; i <= im.size() - 1; i++) {
			System.out.println("hello");
			System.out.println(im.get(i).getAttribute("value"));

		}
		
		driver.close();

	}

}
