package nullexception;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class first {

	public WebDriver driver;

	
	@BeforeSuite
	public void setup() {
		System.out.println("This is before suite");
		driver=new ChromeDriver();
		driver.manage().window().maximize();

	}

}
