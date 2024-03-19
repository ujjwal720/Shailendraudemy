package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());

		for (int i = 0; i <= frames.size() - 1; i++) {

			String h = frames.get(i).getAttribute("id");

			System.out.println(h);

		}

		driver.switchTo().frame("frame1");

		String r_s = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();

		driver.getCurrentUrl();

		System.out.println(r_s);

		driver.switchTo().defaultContent();

		try {
			String r_ss = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		}

		catch (Exception e) {

			System.out.println("wrong");

		}

		System.out.println("Ujjwal");

	}

}
